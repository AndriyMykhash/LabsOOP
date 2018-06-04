package com.company.Ducks;

import com.company.Abstract.Duck;
import com.company.Interface.Implements.*;

public class SimpleDuck extends Duck {

    public SimpleDuck(){

        quacks = new QuackebleBehaviour();
        swiming = new SwimingBehaviour();
    }
}