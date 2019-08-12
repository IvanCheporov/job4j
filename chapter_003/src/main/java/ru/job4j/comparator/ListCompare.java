package ru.job4j.comparator;

import java.util.Comparator;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @since 12.08.2019
 * @version 2.0
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int delta = left.length() > right.length() ? right.length() : left.length();
        for (int i = 0; i < delta; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }
        return result == 0 ? left.length() - right.length() : result;
    }
}
