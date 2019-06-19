package ru.job4j.list;

import java.util.*;

/**
 * @version 1.0
 * @since 19.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */
public class ConvertList2Array {

    /**
     * метод конвертирует двумерный массив в список
     * @param list - список.
     * @return array - двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows == 0 ? list.size() / rows : list.size() / rows + 1;
        int[][] array = new int[rows][cells];
        int row = 0;
        int cell = 0;
        for (int count : list) {
            array[row][cell++] = count;
            if (cell == array[row].length) {
                cell = 0;
                row++;
            }
        } return array;
    }

    /**
     * метод конвертирует список массивов в один список
     * @param list - список массивов.
     * @return result - список.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        list.stream().map(Arrays::stream)
                .forEach(stream -> stream.forEach(result::add));
        return result;
    }
}