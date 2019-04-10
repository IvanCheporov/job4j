package ru.job4j.tracker;

/**
 * @version 1.0
 * @since 04.04.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public interface Input {
    String ask(String question);

    int ask(String question, int[] range);
}
