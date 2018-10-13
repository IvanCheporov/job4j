package ru.job4j.loop;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 13.10.2018.
 */
public class Paint {
         // ћетод подсчета правой стороны пирамиды.
    public String rightTrl(int height) {
        // Ѕуфер дл€ результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте. 
        int weight = height;
        // внешний цикл двигаетс€ по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определ€ет положение €чейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна €чейки, то рисуем галку. 
                // в данном случае строка определ€ем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавл€ем перевод строки.
            screen.append(System.lineSeparator());
        }
        // ѕолучаем результат.
        return screen.toString();
    }

    public String leftTrl(int height) {
              // ћетод подсчета левой стороны пирамиды.
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}