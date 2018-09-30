package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author  Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 30.09.2018
 */
public class PointTest {
    @Test
    public void whenAandBdistanceequals() {
        Point point1 = new Point(0, 1);
        Point point2 = new Point(3, 5);
        double result = point1.distanceTo(point2);
        assertThat(result, Is(5d));
    }
    }