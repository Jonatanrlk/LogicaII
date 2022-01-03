package com.company;

public class ListaLigada
{
    private Nodo cabeza , ultimo , x ;

    public ListaLigada()//constructor
    {
        cabeza = new Nodo(0);
        ultimo = cabeza;
        x = cabeza;

    }

    public void crearListaLigada(int parametroNumero)
    {
        Nodo pointer = new Nodo(parametroNumero);
        ultimo.SetLiga(pointer);
        ultimo = pointer;
    }

    public int MostraLista()
    {
        x = x.GetLiga();
        if(x == null)
        {
            x = cabeza;
        }
        return x.GetNumero();
    }
}
