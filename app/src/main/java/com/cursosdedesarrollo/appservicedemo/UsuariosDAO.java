package com.cursosdedesarrollo.appservicedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pepesan on 20/3/18.
 */

public class UsuariosDAO {
    private List<Usuario> listado;
    UsuariosDAO(){
        listado=new ArrayList<Usuario>();
        loadListado();
    }
    public List<Usuario> find(){
        return listado;
    }
    public void loadListado(){
        listado.add(new Usuario("Pepe"));
        listado.add(new Usuario("Juan"));

    }
}
