package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Zwembad z1 = new Zwembad();
        z1.breedte = 2.0;
        z1.lengte = 2.0;
        z1.diepte = 2.0;
        System.out.println(z1.getBreedte());
        System.out.println(z1.getLengte());
        System.out.println(z1.getDiepte());
        System.out.println(z1.getInhoud());
    }}
