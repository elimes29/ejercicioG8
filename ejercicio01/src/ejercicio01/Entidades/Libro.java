/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.Entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPagina;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }

    
}
