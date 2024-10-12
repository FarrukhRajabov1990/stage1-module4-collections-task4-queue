package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> eatenDishes = new ArrayList<>();

        for (int i = 1; i < numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                queue.add(queue.poll());
            }

            eatenDishes.add(queue.poll());
        }

        return eatenDishes;
    }
}
