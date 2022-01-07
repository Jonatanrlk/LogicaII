package com.company;

public class ListaLigada {

    /*
    la clase llamada LSL (lista simplemente
    ligada), la cual tendrá dos datos privados de la clase nodoSimple, que llamaremos
    primero y ultimo: primero apuntará hacia el primer nodo de la lista y ultimo apuntará hacia
    el último nodo de la lista. Además, definiremos las operaciones que podremos efectuar
    sobre objetos de dicha clase.
     */

    private Nodo primero ;
    private Nodo ultimo ;

    // Metodo constructor

    public ListaLigada(){

        primero = new Nodo(0);
        ultimo = primero;
    }


    // Metodos Getter de los atributos primero y ultimo

    public Nodo getPrimero(){

        return primero;

    }

    public Nodo getUltimo(){

        return ultimo;
    }

    // Metodos

    public Nodo anterior(Nodo xNodo){

        return null;
    }

    public boolean finDeRecorrido(Nodo xNodo){

        return true;
    }

    public void recorrerLista(){

    }

    public Nodo buscaDondeInsertar(int pDato){

        return null;
    }

    public void insertar(int pDato , Nodo y){

    }

    public void conectar(Nodo xNodo, Nodo y){

    }

    public Nodo buscarDato(int d, Nodo y){
        return null;
    }

    public void borrar(Nodo xNodo , Nodo y){

    }

    public void desconectar(){

    }

    public void ordenaAscendentemente(){

    }
}
