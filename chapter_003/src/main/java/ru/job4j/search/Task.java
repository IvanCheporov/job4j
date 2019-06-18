package ru.job4j.search;
/**
 * @version 1.0
 * @since 18.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
