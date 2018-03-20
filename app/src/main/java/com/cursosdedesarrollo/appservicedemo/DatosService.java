package com.cursosdedesarrollo.appservicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class DatosService extends IntentService {
    public static final String ACTION_FINAL =
            "com.cursosdedesarrollo.intent.action.FINAL";
    private Aplicacion app;
    private List<String> listado;
    public DatosService() {
        super("DatosService");
        app=(Aplicacion)getApplication();
        if(app!=null){
            listado=app.modelo.getCadenasDAO().find();
            Log.d("app","DatosService: datos de la aplicacion: "+listado.toString());
        }

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("app","DatosService: onHandleIntent");
        String cadenaPasada=intent.getStringExtra("cadena");
        Log.d("app","DatosService: cadenaPasada: "+cadenaPasada);
        tareaLarga();
        Intent bcIntent = new Intent();
        bcIntent.setAction(ACTION_FINAL);
        bcIntent.putExtra("dato", cadenaPasada);
        sendBroadcast(bcIntent);
    }
    private void tareaLarga()
    {
        try {
            Thread.sleep(10000);
        } catch(InterruptedException e) {}
    }
}
