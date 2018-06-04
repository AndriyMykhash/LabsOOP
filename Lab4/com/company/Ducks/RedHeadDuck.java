package com.company.Ducks;

import com.company.Abstract.Duck;
import com.company.Interface.Implements.*;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flying = new FlyinBehaviour();
        swiming = new SwimingBehaviour();
        quacks = new QuackebleBehaviour();
    }

}
