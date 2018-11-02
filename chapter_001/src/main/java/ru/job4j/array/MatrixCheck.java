package ru.job4j.array;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $2.0$
 * @since 02.11.2018.
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
                if ((i + j) % 2 == 0 && data[i][j] != data[i + 1][i + 1]
                                     && data[i][j] != data[i + 1][data[i + 1].length - i - 2]) {
					result = false;
					break;
				}
            }
        }
        return result;
    }
}