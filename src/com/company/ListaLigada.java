package com.company;

public class ListaLigada
{
    private Nodo cabeza , ultimo;

    public ListaLigada()//constructor
    {
        cabeza = new Nodo(0);
        ultimo = cabeza;
    }

    public void crearListaLigada(int parametroNumero)
    {
        Nodo pointer = new Nodo(parametroNumero);
        ultimo.SetLiga(pointer);
        ultimo = pointer;
    }

}
