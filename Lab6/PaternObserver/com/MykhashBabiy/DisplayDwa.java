package com.MykhashBabiy;

public class DisplayDwa implements IObserver{


    @Override
    public void onUpdateTemperature(int t) {
        System.out.println("At now2: "+t+" degree");
    }

    @Override
    public void onUpdateTusk(int p) {

    }

    @Override
    public void onUpdateVologist(int h) {

    }
}
