package com.MykhashBabiy;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display d = new Display();
        DisplayDwa d2 = new DisplayDwa();
        DisplayTru d3 = new DisplayTru();

        Wether w = new Wether();
        while (true){
            System.out.println("1 - Set temperature");
            System.out.println("2 - Set tusk");
            System.out.println("3 - Set vologist");
            System.out.println("4 - Subscribe d");
            System.out.println("5 - Unsubscribe d");
            System.out.println("6 - Subscribe d2");
            System.out.println("7 - Unsubscribe d2");
            System.out.println("8 - Subscribe d3");
            System.out.println("9 - Unsubscribe d3");


            switch (sc.nextInt()) {

                case 1:
                    w.setTemperature(sc.nextInt());
                    break;
                case 2:
                    w.setVologist(sc.nextInt());
                    break;
                case 3:
                    w.setTusk(sc.nextInt());
                    break;
                case 4:
                    w.subscribe(d);
                    break;
                case 5:
                    w.unsubscribe(d);
                case 6:
                    w.subscribe(d2);
                    break;
                case 7:
                    w.unsubscribe(d2);
                case 8:
                    w.subscribe(d3);
                    break;
                case 9:
                    w.unsubscribe(d3);
                    break;
            }
            System.out.println();
        }
    }
}
