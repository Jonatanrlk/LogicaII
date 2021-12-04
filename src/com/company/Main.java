package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println();
        // Declaracion y Instanciacion de Objetos de la clase Nodo p1,p2,p3,p4
        Nodo p1, p2 , p3 , p4 , p5;
        int auxiliar;

        p1 = new Nodo(7);
        p2 = new Nodo(4);
        p3 = new Nodo(5);
        p4 = new Nodo(2);
        p5 = new Nodo(9);

        System.out.println(" p1 : "+p1.GetNumero()+" p2: "+p2.GetNumero());

        // a) Intercambiar de Info a los dos primeros

        auxiliar = p1.GetNumero();
        p1.SetNumero(p2.GetNumero());
        p2.SetNumero(auxiliar);

        System.out.println(" p1: "+p1.GetNumero()+" p2: "+p2.GetNumero());
    }
}
