package com.example.demo;

public class Bibliotecario extends Persona
{
    private int legajo;

    
    public Bibliotecario(String nombre, int dni, int legajo){
    super(nombre, dni);
    this.legajo = legajo;
    }
    public int getLegajo(){
        return legajo;
    }
}