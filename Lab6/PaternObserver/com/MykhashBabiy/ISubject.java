package com.MykhashBabiy;

public interface ISubject {

    void subscribe(IObserver o);
    void unsubscribe(IObserver o);
    void notifyy();

}
