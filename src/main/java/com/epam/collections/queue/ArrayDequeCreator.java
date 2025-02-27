package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.add(firstQueue.remove());
        result.add(firstQueue.remove());
        result.add(secondQueue.remove());
        result.add(secondQueue.remove());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(result.remove());
            result.add(firstQueue.remove());
            result.add(firstQueue.remove());
            secondQueue.add(result.remove());
            result.add(secondQueue.remove());
            result.add(secondQueue.remove());
        }

        return result;
    }
}
