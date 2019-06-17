package ru.job4j.search;
/**
 * @version 1.0
 * @since 17.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindByNumber() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Cheporov", "1234567", "Saint-Petersburg")
        );
        List<Person> persons = phones.find("123");
        assertThat(persons.iterator().next().getSurname(), is("Cheporov"));
    }
}
