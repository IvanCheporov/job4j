package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 24.10.2018.
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}