package com.company;

import java.util.Scanner;

public class Zwembad {
    double breedte;
    double lengte;
    double diepte;
    double getBreedte(){
        return breedte;
    }
    double getLengte(){
        return lengte;
    }
    double getDiepte(){
        return diepte;
    }
    double getInhoud(){
        double inhoud;
        inhoud = breedte * lengte * diepte;
        return inhoud;
    }

    public Zwembad(double Breedte, double Lengte, double Diepte) {
        breedte = Breedte;
        lengte = Lengte;
        diepte = Diepte;

    }
}

