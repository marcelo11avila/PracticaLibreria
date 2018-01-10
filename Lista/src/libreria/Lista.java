/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import Modelo.Nodo;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Lista<E> {

    Nodo raiz;
    int indice;

    public Lista() {
        raiz = null;
        indice = 0;
    }

    private boolean raizVacia() {
        return raiz == null;
    }

    private boolean objetoYaAgregado(E obj) {
        boolean objetoya = false;
        int i = 1;
        Nodo aux = raiz;
        for (int j = 0; j < indice && aux != null; j++) {
            if (!aux.getDato().equals(obj)) {
                i++;
            }
            aux = aux.getSiguiente();
        }
        if (i <= indice) {
            objetoya = true;
        } else {
            objetoya = false;
        }
        return objetoya;
    }

    public int tamañoLista() {
        return indice;
    }

    public void agregarElemento(E dato) {

        if (raizVacia()) {
            raiz = new Nodo(dato, raiz, indice);
            indice++;
        } else {
            if (objetoYaAgregado(dato) == false) {
                Nodo aux = raiz;

                while (aux.getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }

                Nodo aux2 = new Nodo(dato, aux.getSiguiente(), indice);
                aux.setSiguiente(aux2);
                indice++;
            }
        }
    }

    public Object eliminaUltimElemento() {
        if (this.raizVacia()) {
            return null;
        }
        if (raiz.getSiguiente() == null) {
            Nodo aux2 = raiz;
            raiz = aux2.getSiguiente();
            indice--;
            return aux2.getDato();
        }
        Nodo aux = raiz;
        while (aux.getSiguiente().getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        Object obj = aux.getSiguiente().getDato();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        indice--;

        return obj;
    }

    public void EliminarElemento(E dato) {
        if (raiz != null) {
            if (raiz.getDato() == dato) {
                raiz = raiz.getSiguiente();
            } else {
                Nodo aux = raiz;
                while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
                    aux = aux.getSiguiente();
                }
                try {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                } catch (Exception e) {
                    System.out.println("Dato no Existe en Lista");
                }

            }
        }

    }

    public void VerLista() {
        Nodo aux = raiz;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }

    }

}
