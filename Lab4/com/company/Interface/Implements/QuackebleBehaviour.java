package com.company.Interface.Implements;

import com.company.Interface.IQuackBehav;

public class QuackebleBehaviour implements IQuackBehav {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}