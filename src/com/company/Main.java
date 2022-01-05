package com.company;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println();
        String mensaje="";
        Nodo buscar,recorrer , encontrar ;
        /*Ejercio 1 Modulo 3 del libro de Algoritmia II

         Se tienen nodos v , w , x , y , z
         los cuales tiene en su info 'e' , 'u' , 'c', 'a' , 'r'

        a) conectarlos de manera ascendente(orden alfabetico de A a Z)

        se veria asi 'a' , 'c' , 'e' , 'r' , 'u' (ascendente alfabeticamente)

        Los nodos quedaran organizados y , x , v , z , w

        */

        Nodo y , x , v , z , w ;

        y = new Nodo('a');
        x = new Nodo('c');
        v = new Nodo('e');
        z = new Nodo('r');
        w = new Nodo('u');

        // ligados
        y.setLiga(x);
        x.setLiga(v);
        v.setLiga(z);
        z.setLiga(w);

        buscar = y;
        encontrar = y;
        recorrer = y;


        while(y != null){

            System.out.print(" "+y.getLetra());

            y = y.getLiga();
        }
        //b) Insertar un nuevo Nodo k con info 'f' que al recorrer la lista quede organizado ascendentemente

        Nodo f = new Nodo('f');

        Nodo direccion=null;

        while(buscar != null){

            direccion = buscar;
            if(buscar.getLetra() == 'e'){

                break;
            }
            buscar = buscar.getLiga();

        }

        Nodo siguiente = direccion.getLiga();
        direccion.setLiga(f);
        f.setLiga(siguiente);



       //video
        // Imprimir la lista
        System.out.println();

        System.out.println("Nuevo nodo insertado en la lista");

        while(recorrer != null){

            System.out.print(" "+recorrer.getLetra());

            recorrer = recorrer.getLiga();
        }

        System.out.println();

        // Asignar Null a las variables x , y , z , w, v

        x = y = z = w = v = null;

        while(buscar != null){
            if(buscar.getLetra()=='u'){
                mensaje="Encontrado";
                break;

            }
            buscar = buscar.getLiga();
        }

        System.out.println("Su dato fue : "+mensaje);


        //Desconectar el dato r

        /*
        Terminar despues
         */


    }
}
