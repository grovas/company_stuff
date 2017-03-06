package com.sda.companystaff.controller;

import com.sda.companystaff.model.Boss;
import com.sda.companystaff.model.Worker;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
    UserInput userInput = new UserInput();
    List<Worker> workerList = new ArrayList<>();
    List<Boss> bossList = new ArrayList<>();

    public void addWorker() {
        //userInput.populateWorker();
        workerList.add(userInput.populateWorker());
    }

    public void addBoss() {
        bossList.add(userInput.populateBoss());
    }

    public void showWorkers() {
        System.out.println("W firmie mamy " +
                    workerList.size() + " pracowników");

        System.out.println("Funkcyjna lista pracowników: ");

        workerList.stream().forEach(s -> System.out.println(
                          "Imię: " + s.name + " nazwisko: " + s.lastName));

        workerList.stream().filter(s -> s.name.contains("c")).collect(Collectors.toList());


        /*
        for (Worker w: workerList) {
            System.out.println("Imie: " + w.name +
                                " Nazwisko: " + w.lastName);
        */

    }

    public void showBosses() {
        System.out.println("W firmie mamy " +
                bossList.size() + " szefów");

        bossList.stream().forEach(s->System.out.println(
                        "Imię: " + s.name + " nazwisko: " + s.lastName));
        /*
        for (Boss b: bossList) {
            System.out.println("Imie: " + b.name +
                    " Nazwisko: " + b.lastName);
        */

    }
}
