package com.example.disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        LongEventFactory factory = new LongEventFactory();
        int bufferSize = 1024;

        Disruptor<LongEvent> disruptor = new Disruptor<>(factory, bufferSize, executor, ProducerType.SINGLE, new BlockingWaitStrategy());

        disruptor.handleEventsWith(new LongEventHandler());

        disruptor.start();

        RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();

        LongEventProducer producer = new LongEventProducer(ringBuffer);

        ByteBuffer bb = ByteBuffer.allocate(8);
        for (long l = 0; l < 100; l++) {
            bb.putLong(0, l);
            producer.onData(bb);
            Thread.sleep(100);
        }

        disruptor.shutdown();
        executor.shutdown();
    }
}
