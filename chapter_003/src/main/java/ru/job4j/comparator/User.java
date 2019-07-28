package ru.job4j.comparator;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @since 28.07.2019
 * @version 1.0
 */
public class User implements Comparable<User> {

    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(User user) {
        return this.age - user.getAge();
    }

    public String toString() {
        return String.format("%s : %d", this.name, this.age);
    }
}
