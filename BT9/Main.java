/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dinhc
 */
public class Main {

    public static void main(String[] args) {
        List<Laptop> listLaptop = new ArrayList<>();
        listLaptop.add(new Laptop("hp", "2010hz", 4, "abc", 4010, 2160, "while"));
        listLaptop.add(new Laptop("dell", "2300hz", 12, "abc", 4000, 2170, "while"));
        listLaptop.add(new Laptop("thinkpad", "2030hz", 8, "abc", 4010, 2160, "while"));
        listLaptop.add(new Laptop("mac", "2000hz", 4, "abc", 4020, 2160, "while"));
        listLaptop.add(new Laptop("dell", "2300hz", 12, "abc", 4000, 2170, "while"));
        listLaptop.add(new Laptop("lenovo", "2020hz", 4, "abc", 4000, 2160, "while"));
        listLaptop.add(new Laptop("casio", "2040hz", 12, "abc", 4020, 2160, "while"));
        listLaptop.add(new Laptop("vostro", "2050hz", 8, "abc", 4080, 2160, "while"));
        listLaptop.add(new Laptop("gamming", "2040hz", 8, "abc", 4040, 2160, "while"));
        listLaptop.add(new Laptop("dell", "2300hz", 12, "abc", 4000, 2170, "while"));
        listLaptop.add(new Laptop("hp", "2020hz", 4, "abc", 4000, 2160, "while"));
//sap xep theo brank voi comparable
//Collections.sort(listLaptop);
//sap xep theo cpu voi comparator
// Collections.sort(listLaptop, new Comparator<Laptop>() {
// @Override
// public int compare(Laptop t0, Laptop t1) {
// return t0.getBrand().compareTo(t1.getBrand());
// }
// });
// for(int i=0; i<listLaptop.size(); i++){
// System.out.println(listLaptop.get(i).toString());
// }
//tim kiem
        Laptop searchLaptop = new Laptop("dell", "2300hz", 12, "abc", 4000, 2170, "while");
        int index = Collections.binarySearch(listLaptop, searchLaptop, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop t0, Laptop t1) {
                if (t0.getRam() > t1.getRam()) {
                    return 1;
                } else if (t0.getRam() < t1.getRam()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("tim theo Ram: ");
        System.out.println("index = " + index);
        if (index >= 0) {
            int i = index;
            while (i < listLaptop.size()) {
                if (listLaptop.get(i).getRam() == searchLaptop.getRam()) {
                    System.out.println(listLaptop.get(i).toString());
                }
                i++;
            };
            int j = index - 1;
            while (j >= 0) {
                if (listLaptop.get(j).getRam() == searchLaptop.getRam()) {
                    System.out.println(listLaptop.get(j).toString());
                }
                j--;
            };
        }
    }
}
