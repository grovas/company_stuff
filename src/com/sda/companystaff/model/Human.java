package com.sda.companystaff.model;

/**
 * Created by arczi on 2/20/17.
 */
public class Human {
    public String name;
    public String lastName;
    public int age;
    public int weight;
    public int height;
    public String city;

    public Human(String name, String lastName, int age, int weight, int height, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.city = city;
    }

    public Human () {}

}
