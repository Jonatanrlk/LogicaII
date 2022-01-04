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

    public void EliminarMenor()
    {
        Nodo pointer = cabeza.GetLiga();
        int menor = pointer.GetNumero();
        while(pointer == null)
        {
            if(pointer.GetLiga().GetNumero() < menor)
            {
                menor = pointer.GetLiga().GetNumero();
                break;
            }
        }
    }
    public int ContadorNegativos(){
        Nodo pointer =  cabeza.GetLiga();
        int contador=0 ;
        while(pointer==null){
            if(pointer.GetNumero()<0){
                ++contador;
            }
            pointer = pointer.GetLiga();
        }
        return contador;
    }
}
