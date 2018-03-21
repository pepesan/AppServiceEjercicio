package com.cursosdedesarrollo.appservicedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class Modelo {

    private CadenasDAO cadenasDAO;
    private UsuariosDAO usuariosDAO;

    Modelo(){
        cadenasDAO=new CadenasDAO();
        usuariosDAO=new UsuariosDAO();
    }

    public CadenasDAO getCadenasDAO(){
        return cadenasDAO;
    }
    public UsuariosDAO getUsuariosDAO(){
        return usuariosDAO;
    }


}
