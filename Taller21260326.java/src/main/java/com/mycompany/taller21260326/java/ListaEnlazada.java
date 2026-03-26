/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller21260326.java;

/**
 *
 * @author Admin
 */
public class ListaEnlazada {
     public class ListaEnlazada {
    private Taller21260326Java.Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }
}
public void insertar(int dato) {
    Taller21260326Java.Nodo nuevo = new Taller21260326Java.Nodo(dato);
     Object cabeza = null;

    if (cabeza == null) {
        cabeza = nuevo;
    } else {
        Taller21260326Java.Nodo actual = (Taller21260326Java.Nodo) cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
}

public void mostrar() {
     Taller21260326Java.Nodo cabeza = null;
    Taller21260326Java.Nodo actual = cabeza;

    while (actual != null) {
        System.out.print(actual.dato + " -> ");
        actual = actual.siguiente;
    }
    System.out.println("null");
}

public boolean buscar(int valor) {
     Taller21260326Java.Nodo cabeza = null;
    Taller21260326Java.Nodo actual = cabeza;

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
     Taller21260326Java.Nodo cabeza = null;
    Taller21260326Java.Nodo actual = cabeza;

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

    Taller21260326Java.Nodo actual = (Taller21260326Java.Nodo) cabeza;

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
}
