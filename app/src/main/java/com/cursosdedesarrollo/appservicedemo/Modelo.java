package com.cursosdedesarrollo.appservicedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class Modelo {

    private CadenasDAO cadenasDAO;

    Modelo(){
        cadenasDAO=new CadenasDAO();
    }

    public CadenasDAO getCadenasDAO(){
        return cadenasDAO;
    }


}
