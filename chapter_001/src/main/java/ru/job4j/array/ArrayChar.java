package ru.job4j.array;
/**
* @author Ivan Cheporov (vanessok@mail.ru).
* @since 26.10.2018.
* @param prefix.
* @return result.
*/

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяем, что начало слова соответствует префиксу.
     * @param prefix префикс.
     * @return Булево значение, если слово не)начинается с префикса.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}