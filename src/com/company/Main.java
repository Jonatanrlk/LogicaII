package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //Declaracion
        Nodo v , w , x , y , z , k;

        //Instanciacion
        v = new Nodo('e');
        w = new Nodo('u');
        x = new Nodo('c');
        y = new Nodo('a');
        z = new Nodo('r');
        k = new Nodo('f');

        // Conectarlos de forma ascendentemente (a , c , e , r , u)
        y.SetLiga(x);
        x.SetLiga(v);
        v.SetLiga(z);
        z.SetLiga(w);

        // Mostrar Lista
        Nodo r = y;
        System.out.println("Lista Original");
        MostrarLista(r);  // subprograma para mostrar la lista

        System.out.println();
        //Insectar Nuevo Nodo( k es el nuevo Nodo)
        y.SetLiga(x);
        x.SetLiga(v);
        v.SetLiga(k);
        k.SetLiga(z);
        z.SetLiga(w);
        Nodo p = y;
        System.out.println("Lista con un Nodo Insectado");
        MostrarLista(p);

        System.out.println();
        // Asignar null a la variables de Tipo Nodo (x,v,k,z,w)las cuales almacenan la dirreccion de memoria de cada Nodo

        x = v = k = z = w = null;

        // Elminar un Nodo
        Nodo m = null ; // m es la variable que guardara la direcion de memoria del anterior Nodo
        Nodo s = y;

        System.out.println();

    }
    public static void MostrarLista(Nodo pointer)
    {
        while(pointer != null)
        {
            System.out.print(" "+pointer.GetLetra());
            pointer = pointer.GetLiga();
        }
    }

}
