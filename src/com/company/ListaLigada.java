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
    private Nodo x ; // esta variable se va a utilizar para recorrer la lista

    // Metodo constructor

    public ListaLigada(){

        primero = new Nodo(0);
        ultimo = primero;
        x = primero;
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
        while (pointer != xNodo){

            anterior = pointer;

            pointer = pointer.GetLiga();
        }
        return anterior;
        // si retorna null es porque la direccion del nodo que
        // entro como parametro no hace parte de la lista
        // puede que sea de otra o es un nodo suelto.
    }

    public int recorrerLista(){

        x = x.GetLiga();
        // cada vez que el metodo se llame va ir de liga en liga
        // hasta que llega al nodo ultimo el cual tiene un null
        // en su liga

        if(x==null){
            x = primero;
            // cuando sea x igual a null , se le asignara la direccion
            // del primer nodo la cual contiene un cero en el info
        }

        return x.GetNumero();
        //cuando x sea igual a primero(cab) mandara el info que esta dentro de primero
        //el cual contiene 0.
    }

    public Nodo buscaDondeInsertar(int pDato){
        Nodo p = primero.GetLiga() ;
        Nodo y = anterior(p);
        while(p != null && p.GetNumero() < pDato){
            y = p ;
            p = p.GetLiga();
        }
        return y;
    }

    public void insertar(int pDato , Nodo y){
        Nodo x ;
        x = new Nodo(pDato);
        conectar(x , y);

    }

    public void conectar(Nodo xNodo, Nodo y){
        if(y != null)
        {
            x.SetLiga(y.GetLiga());
            y.SetLiga(x);
            if(y == ultimo){
                ultimo = x;
            }
        }
        else
        {
            x.SetLiga(primero);
            if(primero==null){
                ultimo = x;
            }
            primero = x;
        }

    }

    public Nodo buscarDato(int d, Nodo y){
        Nodo x ;
        x = primero.GetLiga();
        y = anterior(x);
        while (x != null && x.GetNumero() != d){
            y = x;
            x = x.GetLiga();
        }
        return x;
    }

    public void borrar(Nodo xNodo , Nodo y){
        if( xNodo == null){
            System.out.println("dato no existe");
        }
        desconectar(x ,y);

    }

    public void desconectar(Nodo xNodo , Nodo yNodo){
        if(xNodo != primero){
            yNodo.SetLiga(xNodo.GetLiga());
            if(xNodo == ultimo){
                ultimo = yNodo ;
            }
        }else{
            primero = primero.GetLiga();
            if(primero == null){
                ultimo = null;
            }
        }
    }

    public void ordenaAscendentemente(){
        Nodo p , ap , menor , amenor , q , aq;

        p = primero;

        ap = anterior(p);
        while (p != ultimo){
            menor = p ;
            amenor = ap;
            q = p.GetLiga();
            aq = p;
            while (primero != null){
                if(q.GetNumero() < menor.GetNumero()){
                    menor = q ;
                    amenor = aq;
                }
                aq = q ;
                q = q.GetLiga();
            }
            if(menor == p ){
                ap = p ;
                p = p.GetLiga();
            }else{
                desconectar(menor , amenor);
                conectar(menor, ap);
                ap = menor;
            }
        }

    }

//
//    public boolean finDeRecorrido(Nodo pNodo){
//
//        if(pNodo == null){
//            return true;
//        }
//        return false;
//        //envia falso queriendo decir de que no se termino el recorrido de la lista
//    }

}
