package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class BibliotecaController {

    @FXML
    private TableView<Libro> tablaLibros;

    @FXML
    private TableColumn<Libro, String> colTitulo;

    @FXML
    private TableColumn<Libro, String> colAutor;

    @FXML
    private TableColumn<Libro, String> colIsbn;

    @FXML
    private TableColumn<Libro, Boolean> colDisponible;

    @FXML
    private TextField campoIsbn;

    @FXML
    private TextField campoSocio;

    @FXML
    private TextField campoFecha;

    @FXML
    private Label mensaje;

    private Biblioteca biblioteca;
    private ObservableList<Libro> listaLibros;

    @FXML
    public void initialize() {
        biblioteca = new Biblioteca("Biblioteca Central");

        // Algunos libros de ejemplo para probar
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "978-1"));
        biblioteca.agregarLibro(new Libro("El principito", "Antoine de Saint-Exupéry", "978-2"));

        // Le decimos a cada columna de qué atributo de Libro sacar el valor
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colIsbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        colDisponible.setCellValueFactory(new PropertyValueFactory<>("disponible"));

        actualizarTabla();
    }

    private void actualizarTabla() {
        listaLibros = FXCollections.observableArrayList(biblioteca.getLibros());
        tablaLibros.setItems(listaLibros);
    }

    @FXML
    private void prestarLibro() {
        String isbn = campoIsbn.getText();
        String nombreSocio = campoSocio.getText();
        String fecha = campoFecha.getText();

        Socio socio = new Socio(nombreSocio, 0, 0, "");
        biblioteca.realizarPrestamo(socio, isbn, fecha);

        actualizarTabla();
        mensaje.setText("Operación de préstamo procesada.");
    }
        @FXML
        private void devolverLibro() {
            String isbn = campoIsbn.getText();
            String fecha = campoFecha.getText();

            biblioteca.devolverLibro(isbn, fecha);

            actualizarTabla();
            mensaje.setText("Operación de devolución procesada.");
        }
    }