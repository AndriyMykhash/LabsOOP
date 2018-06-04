package com.company.Abstract;

import com.company.Interface.*;

public abstract class Duck{
    protected IQuackBehav quacks;
    protected ISwimBehav swiming;
    protected IFly flying;
    protected IPisk pisking;

    public void performQuack()
    {
        quacks.quack();
    }

    public void performSwim(){
        swiming.swim();
    }
    public void performFly(){
        flying.fly();
    }
    public void performPisk(){
        pisking.pisk();
    }

}