package ru.job4j.trackersinglefont;

import ru.job4j.tracker.models.Item;
import ru.job4j.tracker.start.Tracker;

import java.util.List;

/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version 1.0
 * @since 29.04.2019
 */
public enum TrackerSingleEnumEager {
    INSTANCE;
    private Tracker tracker;

    private TrackerSingleEnumEager() {
        this.tracker = new Tracker();
    }

    public Item add(Item item) {
        return this.tracker.add(item);
    }

    public Item findById(String id) {
        return this.tracker.findById(id);
    }

    public void replace(String id, Item item) {
        this.tracker.replace(id, item);
    }

    public void delete(String id) {
        this.tracker.delete(id);
    }

    public List<Item> findByName(String key) {
        return this.tracker.findByName(key);
    }

    public List<Item> getAll() {
        return this.tracker.getAll();
    }
}