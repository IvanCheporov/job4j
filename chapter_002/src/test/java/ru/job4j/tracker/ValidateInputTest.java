package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * 
 * @author Ivan Cheporov (vanessok@mail.ru).
 * @since 02.07.2019
 */
 
  public class ValidateInputTest {

    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidLetterInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"a", "1"}));
        input.ask("Enter", new int[]{1});
        assertThat(this.mem.toString(), is(format("Некорректный ввод! Введите в числовом формате.\n"))
        );
    }

    @Test
    public void whenInvalidArrayOutInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"9", "1"}));
        input.ask("Enter", new int[]{1});
        assertThat(this.mem.toString(), is(format("Некорректный ввод! Введите число из диапазона меню.\n"))
        );
    }
}