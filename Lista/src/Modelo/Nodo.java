/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Nodo<E> {

    private int indice = 0;
    private Nodo siguiente;
    private E dato;

    public Nodo() {
        siguiente = null;
        dato = null;
    }

    public Nodo(E dat, Nodo n, int ind) {
        dato = dat;
        siguiente = n;
        indice = ind;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public String toString() {
        return "" + dato;
    }
}
