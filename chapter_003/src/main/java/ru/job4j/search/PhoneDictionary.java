package ru.job4j.search;
/**
 * @version 1.0
 * @since 17.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private final List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public List<Person> find(String key) {
        return persons.stream().filter(
                person -> person.getName().contains(key)
                        || person.getSurname().contains(key)
                        || person.getPhone().contains(key)
                        || person.getAddress().contains(key)
        ).collect(Collectors.toList());
    }
}
