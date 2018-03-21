package com.cursosdedesarrollo.appservicedemo;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class Aplicacion extends Application {
    public Modelo modelo;
    @Override
    public void onCreate() {
        super.onCreate();
        modelo=new Modelo();
        Log.d("app","Aplicacion: Carga de mi clase Aplicación!");
        Log.d("app","Aplicacion: Carga los datos: "+modelo.getCadenasDAO().find().toString());
    }

}
