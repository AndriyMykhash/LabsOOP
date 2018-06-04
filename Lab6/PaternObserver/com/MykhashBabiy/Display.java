package com.MykhashBabiy;

public class Display implements IObserver {

    @Override
    public void onUpdateTemperature(int t) {

    }

    @Override
    public void onUpdateTusk(int p) {
        System.out.println("At now1: "+p+" mm.r.s");
    }

    @Override
    public void onUpdateVologist(int h) {
    }
}
