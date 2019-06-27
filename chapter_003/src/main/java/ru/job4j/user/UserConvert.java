package ru.job4j.user;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @since 27.06.2019
 * @author Ivan Cheporov(vanessok@mail.ru)
 */

public class UserConvert {

    /**
     * метод конвертирует список List в интерфейс Map.
     * @param list - список.
     * @return userMap.
     */
    public HashMap<Integer, User> process(List<User> list) {
        return list.stream().collect(
                Collectors.toMap(User::getId, user -> user, (a, b) -> a, HashMap::new));
    }
}
