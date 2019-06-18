package ru.job4j.search;

import java.util.LinkedList;
/**
 * @version 1.0
 * @since 18.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public class PriorityQueue {
    private final LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = (int) this.tasks.stream().filter(
                position -> task.getPriority() > position.getPriority()
        ).count();
        this.tasks.add(index, task);
    }
    public Task take() {
        return this.tasks.poll();
    }
    public Task takeLast() {
        return this.tasks.pollLast();
    }

}
