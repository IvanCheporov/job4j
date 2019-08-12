package ru.job4j.comparator;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @since 12.08.2019
 * @version 2.0
 */
public class SortUser {

    /**
     * метод принимает List и возвращает TreeSet пользователей,
     * отсортированных по возрасту в порядке возрастания.
     * @param users - список пользователей
     * @return userSet
     */
    public Set<User> sort(List<User> users) {
        return users.stream().sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    //компаратор для сотировки списка пользователей по длине имени
    class NameLengthComparator implements Comparator<User> {
        @Override
        public int compare(User user1, User user2) {
            return user1.getName().length() - (user2.getName().length());
        }
    }

    /**
     * метод принимает список пользователей и
     * с помощью компаратора сортирует их по длине имени
     * @param users - список пользователей
     * @return users - отсортированный список польозвателей
     */
    public List<User> sortNameLength(List<User> users) {
        return users.stream().sorted(new NameLengthComparator()).collect(Collectors.toList());
    }

    //компаратор для сотировки списка пользователей по имени и возрасту
    class AllFieldsComparator implements Comparator<User> {
        @Override
        public int compare(User user1, User user2) {
            int result = user1.getName().compareTo(user2.getName());
            if (result == 0) {
                result = Integer.compare(user1.getAge(), user2.getAge());
            }
            return result;
        }
    }

    /**
     * метод принимает список пользователей и
     * с помощью компаратора сортирует их по имени и возрасту
     * @param users - список пользователей
     * @return users - отсортированный список польозвателей
     */
    public List<User> sortByAllFields(List<User> users) {
        return users.stream().sorted(new AllFieldsComparator()).collect(Collectors.toList());
    }

}
