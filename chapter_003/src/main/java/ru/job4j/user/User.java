package ru.job4j.user;

/**
 * @version 1.0
 * @since 27.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public class User {
    private Integer id;
    private String name;
    private String city;

    public User(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }


}
