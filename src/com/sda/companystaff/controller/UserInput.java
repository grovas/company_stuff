package com.sda.companystaff.controller;

import com.sda.companystaff.model.Boss;
import com.sda.companystaff.model.Worker;

import java.util.Scanner;

public class UserInput {
    public Worker populateWorker() {
        Worker worker = new Worker();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie pracownika: ");
        worker.name = in.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        worker.lastName = in.nextLine();
        System.out.println("Podaj wiek pracownika");
        worker.age = in.nextInt();

        return worker;
    }

    public Boss populateBoss() {
        Boss boss = new Boss();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie szefa: ");
        boss.name = in.nextLine();
        System.out.println("Podaj nazwisko szefa: ");
        boss.lastName = in.nextLine();
        System.out.println("Podaj wiek szefa");
        boss.age = in.nextInt();

        return boss;
    }

}
