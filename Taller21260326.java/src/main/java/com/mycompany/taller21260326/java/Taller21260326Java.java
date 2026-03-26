/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller21260326.java;

/**
 *
 * @author Katherine Ortega 
 * 6014550
 */
public class Taller21260326Java {

 public class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
 public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }
}
public void insertar(int dato) {
    Nodo nuevo = new Nodo(dato);
     Object cabeza = null;

    if (cabeza == null) {
        cabeza = nuevo;
    } else {
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
}
