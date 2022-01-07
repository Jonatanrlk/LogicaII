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

    public boolean esVacia(){

        if(primero.GetLiga()==null){
            return true;
            // retorna verdadero queriendo decir que no hay nodos ligados al primero
        }
        return false;
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
        Nodo anterior= null;//para este caso podemos asignarle tambien la direccion
                            //del primero nodo osea (cab)
        Nodo pointer = primero.GetLiga();
        while (pointer != null){

            if(xNodo == primero){
                break;
            }
            anterior = pointer;
            pointer = pointer.GetLiga();
        }
        return anterior;
        // si retorna null es porque la direccion del nodo que
        // entro como parametro no hace parte de la lista
        // puede que sea de otra o es un nodo suelto.
    }

    public boolean finDeRecorrido(Nodo pNodo){

        if(pNodo == null){
            return true;
        }
        return false;
        //envia falso queriendo decir de que no se termino el recorrido de la lista
    }

    public void recorrerLista(){
        Nodo pointer = primero.GetLiga();


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
