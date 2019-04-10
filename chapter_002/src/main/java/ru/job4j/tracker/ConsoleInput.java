package ru.job4j.tracker;

import java.util.*;

/**
 * @version 1.0
 * @since 04.04.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.next();
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Введите число из диапазона меню!");
        }
        return key;
    }
}
