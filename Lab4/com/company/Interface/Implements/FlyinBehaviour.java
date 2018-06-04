package com.company.Interface.Implements;
import com.company.Interface.IFly;

public class FlyinBehaviour implements IFly{

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
