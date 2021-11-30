package com.company.Menus;

import java.util.Scanner;

public class Menu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){

        System.out.println("Welcome to the programme");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);
        int response = Integer.parseInt(sc.nextLine());

        do {
            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    showDoctorMenu();
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit!");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while ( response != 0);

    }

    public static void showPatientMenu(){
        int response;
        do {
            System.out.println("\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(/*(i+1) +*/ ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("PLease select a correct answer");

            }
        }while (response != 0);
    }

    public static void showDoctorMenu(){
        int response;
        do {
            System.out.println("\n");
            System.out.println("Doctor");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(/*(i+1) +*/ ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("PLease select a correct answer");

            }
        }while (response != 0);
    }
}
