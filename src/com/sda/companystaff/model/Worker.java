package com.sda.companystaff.model;

public class Worker extends Human {
    public String level;
    public double salary;

    public Worker(String name, String lastName, int age, int weight, int height, String city) {
        super(name, lastName, age, weight, height, city);
    }

    public Worker(String name, String lastName, int age, int weight, int height, String city, String level, double salary) {
        super(name, lastName, age, weight, height, city);
        this.level = level;
        this.salary = salary;
    }


    public Worker () {}

    @Override
    public String toString() {
        return "Worker{" +
                "level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
}
