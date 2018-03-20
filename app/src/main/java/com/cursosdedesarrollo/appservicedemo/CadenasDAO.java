package com.cursosdedesarrollo.appservicedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class CadenasDAO {
    private List<String> listado;
    CadenasDAO(){
        listado=new ArrayList<String>();
        loadListado();
    }
    public List<String> find(){
        return listado;
    }
    public void loadListado(){
        listado.add("Hola");
        listado.add("Mundo");

    }
}
