package com.example.demo;

public class Socio extends Persona
{
    private int numeroSocio;
    private String fechaAlta;

    public Socio(String nombre, int dni, int numeroSocio, String fechaAlta){
        super(nombre,dni);
        this.numeroSocio = numeroSocio;
        this.fechaAlta = fechaAlta;
    }
    public int getNumeroSocio(){
        return numeroSocio;
    }
}