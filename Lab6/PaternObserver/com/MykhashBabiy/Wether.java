package com.MykhashBabiy;

import java.util.ArrayList;

public class Wether implements ISubject {

    private ArrayList<IObserver> users = new ArrayList<>();

    private int temperature;
    private int tusk;
    private int vologist;
    /*
    *
    * треба так, щоб коли змінювали темпаратуру, повідомляло про її зміну
    *
    * */
    void setTemperature(int temperature){
        this.temperature=temperature;
        notifyy();
    }

    int setTusk(int tusk){
        return this.tusk=tusk;
    }

    int setVologist(int vologist){
        return this.vologist=vologist;
    }

    @Override
    public void subscribe(IObserver o) {

        users.add(o);
    }

    @Override
    public void unsubscribe(IObserver o) {
        users.remove(o);
    }

    @Override
    public void notifyy() {
        for(int i = 0; i < users.size(); i++){

            users.get(i).onUpdateTemperature(temperature);
            users.get(i).onUpdateTusk(tusk);

            users.get(i).onUpdateVologist(vologist);

        }
    }
}
