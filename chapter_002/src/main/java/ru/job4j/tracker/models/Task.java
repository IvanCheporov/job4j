package ru.job4j.tracker.models;
/**
 * @author Ivan Cheporov (vanessok@mail.ru)
 * @version $1.0$
 * @since 28.12.2018.
 */

public class Task extends Item {
	public Task(String name, String desc) {
		this.setName(name);
		this.setDescription(desc);
	}
}