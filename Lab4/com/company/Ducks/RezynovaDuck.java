package com.company.Ducks;

import com.company.Abstract.Duck;
import com.company.Interface.Implements.PiskBehaviour;
import com.company.Interface.Implements.SwimingBehaviour;

public class RezynovaDuck extends Duck {
    public RezynovaDuck(){
        pisking = new PiskBehaviour();
        swiming = new SwimingBehaviour();

    }


}
