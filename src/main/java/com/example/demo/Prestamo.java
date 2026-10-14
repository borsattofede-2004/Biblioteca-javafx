package com.example.demo;

public class Prestamo
{
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Socio socio;
    private Libro libro;
    
    public Prestamo(String fechaPrestamo, String fechaDevolucion, Socio socio, Libro libro){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.socio = socio;
        this.libro = libro;
    }
    public String getFechaPrestamo(){
        return fechaPrestamo;
    }
    public String getFechaDevolucion(){
        return fechaDevolucion;
    }
    public Socio getSocio(){
        return socio;
    }
    public Libro getLibro(){
        return libro;
    }
    public void registrarDevolucion(String fecha){
        this.fechaDevolucion = fecha;
    }
    
}