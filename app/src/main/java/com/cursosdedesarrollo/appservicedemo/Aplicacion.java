package com.cursosdedesarrollo.appservicedemo;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class Aplicacion extends Application {
    private List<String> listado;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("app","Aplicacion: Carga de mi clase Aplicación!");
        listado=new ArrayList<String>();
        loadListado();
        Log.d("app","Aplicacion: Carga los datos: "+listado.toString());
    }
    private void loadListado(){
        listado.add("Hola");
        listado.add("Mundo");

    }
    public List<String> getListado(){
        return listado;
    }
}
