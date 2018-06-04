package com.company.Interface.Implements;
import com.company.Interface.ISwimBehav;

public class SwimingBehaviour implements ISwimBehav{
    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
