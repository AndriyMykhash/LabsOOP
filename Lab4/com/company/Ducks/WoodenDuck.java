package com.company.Ducks;

import com.company.Abstract.Duck;
import com.company.Interface.Implements.SwimingBehaviour;

public class WoodenDuck extends Duck {

    public WoodenDuck(){
        swiming = new SwimingBehaviour();
    }
}