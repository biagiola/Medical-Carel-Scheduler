package com.company;

import com.company.model.Doctor;
import com.company.model.User;

import java.util.*;

import static com.company.Menus.Menu.showMenu;

public class Main {

    public static void main(String[] args) {
//        showMenu();

//        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
//        myDoctor.addAvailableAppointment(new Date(), "4pm");
//        myDoctor.addAvailableAppointment(new Date(), "10am");
//        myDoctor.addAvailableAppointment(new Date(), "1pm");
//
//        System.out.println(myDoctor);
//
//        User user = new Doctor("David Biaigola", "biagiola@gmail.com");
//        System.out.println();
//        System.out.println(user);


        List<Integer> array = Arrays.asList(1,5,7,6,8,4,2,1,3,5,4,8,9);
        //System.out.println("array" + array);

        System.out.println();

        Set<Integer> numbersHashSet = new HashSet(); // order does not matter
        Set<Integer> numbersLinkedSet = new LinkedHashSet<>(); // order by their insertion
        Set<Integer> numbersTreeSet = new TreeSet<>(); // order by their values

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int ran_int = rand.nextInt(10);
            numbersHashSet.add(ran_int);
            numbersLinkedSet.add(ran_int);
            numbersTreeSet.add(ran_int);
            System.out.println(ran_int);
        }
        // values will be not ordered
        // repeat numbers not allow
        System.out.println("numbersHashSet");
        System.out.println(numbersHashSet);

        // values will be order by their insertion coming
        // repeat numbers not allow
        System.out.println("LinkedSet");
        System.out.println(numbersLinkedSet);

        // values will be order by their values in ascending order
        // repeat numbers not allow
        System.out.println("numbersTreeSet");
        System.out.println(numbersTreeSet);









    }
}
