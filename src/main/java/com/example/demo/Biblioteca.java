package com.example.demo;

import java.util.ArrayList;

public class Biblioteca
{
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private ArrayList<Prestamo> prestamos;
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.socios = new ArrayList<Socio>();
        this.prestamos = new ArrayList<Prestamo>();
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public void agregarSocio(Socio socio){
        socios.add(socio);
    }
    public void listarLibros(){
        for(Libro l : libros){
            System.out.println(l.getTitulo());
        }
    }
    public void eliminarLibro(String isbn){
        Libro aEliminar = null;
        for(Libro l : libros){
            if(l.getIsbn().equals(isbn)){
                aEliminar = l;
            }
        }
        if(aEliminar != null){
            libros.remove(aEliminar);
            System.out.println("Libro eliminado: " + aEliminar.getTitulo());
        } else {
            System.out.println("No se encontró un libro con ese ISBN");
        }
    }
    public void realizarPrestamo(Socio socio, String isbn, String fecha){
        Libro libroEncontrado = null;
        for(Libro l : libros){
            if(l.getIsbn().equals(isbn) && l.isDisponible()){
                libroEncontrado = l;
            }
        }   
        if(libroEncontrado != null){
            Prestamo nuevoPrestamo = new Prestamo(fecha, null, socio, libroEncontrado); 
            prestamos.add(nuevoPrestamo);
            libroEncontrado.setDisponible(false);
            System.out.println("Préstamo realizado: " + libroEncontrado.getTitulo() + " a " + socio.getNombre());
        } else {
            System.out.println("El libro no está disponible o no existe");
        }
    }
    public void devolverLibro(String isbn, String fecha){
        Prestamo prestamoEncontrado = null;
        for(Prestamo p : prestamos){
            if(p.getLibro().getIsbn().equals(isbn) && p.getFechaDevolucion() == null){
                prestamoEncontrado = p;
            }
        }
        
        if(prestamoEncontrado != null){
            prestamoEncontrado.registrarDevolucion(fecha);
            prestamoEncontrado.getLibro().setDisponible(true);
            System.out.println("Devolución registrada: " + prestamoEncontrado.getLibro().getTitulo());
        } else {
            System.out.println("No se encontró un préstamo activo con ese ISBN");
        }
    }
}