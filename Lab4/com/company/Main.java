package com.company;
import com.company.Abstract.*;
import com.company.Ducks.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("WoodenDuck");
        Duck wood = new WoodenDuck();
        wood.performSwim();

        System.out.println("RedHeadDuck");
        Duck red = new RedHeadDuck();
        red.performSwim();
        red.performQuack();
        red.performFly();

        System.out.println("RezynovaDuck");
        Duck rezuna = new RezynovaDuck();
        rezuna.performPisk();
        rezuna.performSwim();

        System.out.println("SimpleDuck");
        Duck simple = new SimpleDuck();
        simple.performSwim();
        simple.performQuack();

    }
}




