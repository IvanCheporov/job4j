package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @since 19.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */
public class ConvertMatrix2List {
    /**
     * метод конвертирует двумерный массив в список
     * @param array - двумерный массив.
     * @return list - список.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> result = new ArrayList<>();
        Arrays.stream(array).map(Arrays::stream)
                .forEach(stream -> stream.forEach(result::add));
        return result;
    }
}
