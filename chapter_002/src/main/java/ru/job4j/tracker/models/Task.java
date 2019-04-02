package ru.job4j.tracker.models;

public class Task extends Item {

	private final String desc;
	private final String namer;

	public Task(String name, String desc) {
		this.namer = name;
		this.desc = desc;
	}
}