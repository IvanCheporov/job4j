package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Ivan Cheporov (mailto:vanessok@mail.ru).
 * @version $1.0$.
 * @since 16.09.2018.
 */
@SuppressWarnings("WeakerAccess")
public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Method echo.
     * @param name Ivan.
     * @return Echo plus Ivan.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}