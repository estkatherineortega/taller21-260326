/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller21260326.java;

/**
 *
 * @author Katherine Ortega 
 * 6014550
 * Katherine Ortega <est.katherine.ortega@unimilitar.edu.co>
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
        Nodo actual = (Nodo) cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
}

public void mostrar() {
     Nodo cabeza = null;
    Nodo actual = cabeza;

    while (actual != null) {
        System.out.print(actual.dato + " -> ");
        actual = actual.siguiente;
    }
    System.out.println("null");
}

public boolean buscar(int valor) {
     Nodo cabeza = null;
    Nodo actual = cabeza;

    while (actual != null) {
        if (actual.dato == valor) {
            return true;
        }
        actual = actual.siguiente;
    }
    return false;
}

public int tamaño() {
    int contador = 0;
     Nodo cabeza = null;
    Nodo actual = cabeza;

    while (actual != null) {
        contador++;
        actual = actual.siguiente;
    }
    return contador;
}

public void eliminar(int valor) {
     Object cabeza = null;
    if (cabeza == null) return;

    if (cabeza.dato == valor) {
        cabeza = cabeza.siguiente;
        return;
    }

    Nodo actual = (Nodo) cabeza;

    while (actual.siguiente != null) {
        if (actual.siguiente.dato == valor) {
            actual.siguiente = actual.siguiente.siguiente;
            return;
        }
        actual = actual.siguiente;
    }
}

public int encontrarFaltante(int n) {
    for (int i = 1; i <= n; i++) {
        if (!buscar(i)) {
            return i;
        }
    }
    return -1;
}
