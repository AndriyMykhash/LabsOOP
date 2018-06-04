package com.MykhashBabiy;

public class DisplayTru implements IObserver {


    @Override
    public void onUpdateTemperature(int t) {

    }

    @Override
    public void onUpdateTusk(int p) {
        System.out.println("At now3: "+p+" mm.r.s");
    }

    @Override
    public void onUpdateVologist(int h) {
        System.out.println("At now3: "+h+"%");
    }
}