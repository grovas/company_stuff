package com.sda.companystaff;


import com.sda.companystaff.controller.Controller;
import com.sda.companystaff.controller.GUI;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(
            // zamiast Main inna nazwa klasy w ktorej jest ta zmienna LOGGER
            Main.class.getName()); // wyciagamy nazwe klasy

    public static void main(String[] args) throws IOException {
        // write your code here

        String login = "artur";
        String password = "1234";
        String userLogin;
        String userPass;

        boolean flag = true;
        int option = 0;
        boolean optionFlag = true;

        Controller controller = new Controller();
        Scanner in = new Scanner(System.in);
        /*
        while (flag) {
            System.out.println("Podaj login: ");
            userLogin = in.nextLine();
            System.out.println("Podaj haslo: ");
            userPass = in.nextLine();

            if (!(userLogin.equals(login) &&
                    userPass.equals(password))) {
                System.out.println("Podales zle dane");
            }
            else flag=false;
        }*/
        //menu
        // tworzenie pliku logowania
        LOGGER.addHandler(new FileHandler("loger.xml"));

        // zalaczenie sciezki do pliku loggera
        LOGGER.info("Logger Name: "+LOGGER.getName());


        while (optionFlag) {

            System.out.println(GUI.companyName);
            GUI.showMenu();
            boolean flag2 = true;

            while (flag2) {
                try {
                    // obiekt klasy kontroler
                    option = in.nextInt();
                    flag2 = false;
                } catch (InputMismatchException ex) {
                    LOGGER.log(Level.SEVERE, "Exception occur");
                    System.out.println("To nie jest int");
                    in.next();
                }
            }

            switch (option) {
                case 1:
                    // dodawanie
                    controller.addWorker();
                    break;
                case 2:
                    // dodawanie szefa
                    controller.addBoss();
                    break;
                case 3:
                    //pokaz wszystkich pracownikow
                    controller.showWorkers();
                    break;
                case 4:
                    //pokaz wszystkich szefow
                    controller.showBosses();
                    break;
                default:
                    optionFlag = false;
            }
        }
    }
        /*
        List<Worker> workers = new ArrayList<Worker>();

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker(
                "Adam", "Orłowski",
                44, 65, 177, "Toruń",
                "student", 4444);

        worker1.level = "master";
        worker1.salary = 22222.33;
        worker1.city = "Toruń";
        worker1.lastName = "Ogan";
        worker1.name = "Łukasz";

        worker2.level = "slave";
        worker2.salary = 3422.33;
        worker2.city = "Palermo";
        worker2.lastName = "Felipe";
        worker2.name = "Don";

        worker3.level = "proxy";
        worker3.salary = 3422.33;
        worker3.city = "Wiena";
        worker3.lastName = "Schwartz";
        worker3.name = "Gregor";

        Boss boss1 = new Boss();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker1);
        System.out.println("Rozmiar listy: " + workers.size());

        for (int w=0; w<workers.size(); w++) {
            System.out.println(workers.get(w).name);
        }
        for (Worker w: workers) { System.out.println("Worker name: " + w.name);}
        for (Worker w: workers) {
            System.out.println("Worker city: " + w.city);
        }
        */

}
