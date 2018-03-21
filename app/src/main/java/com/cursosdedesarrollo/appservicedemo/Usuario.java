package com.cursosdedesarrollo.appservicedemo;

/**
 * Created by pepesan on 20/3/18.
 */

public class Usuario {
    public String name;

    public Usuario() {
        this.name = "";
    }

    public Usuario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                '}';
    }
}
