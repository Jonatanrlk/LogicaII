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

        //Buscar el info Mayor de los Tres primero (p1,p2 y p3)
        int primero, segundo , tercero , infoMayor;
        primero = p1.GetNumero();
        segundo = p2.GetNumero();
        tercero = p3.GetNumero();
        if(primero > segundo && primero > tercero)
        {
            infoMayor = primero;
        }
        else
        {
            if(segundo > tercero){
                infoMayor = segundo;
            }else{
                infoMayor = tercero;
            }
        }
        System.out.println("El info mayor de los tres primeros es : "+infoMayor);

        //Calcular El producto del Info de los Dos Ultimos(p4 y p5)

        int cuarto , quinto , producto;

        cuarto = p4.GetNumero();
        quinto = p5.GetNumero();

        producto = cuarto * quinto;
        System.out.println("El producto de los Dos ultimos es : "+producto);

        //Ligar los cinco nodos
        p1.SetLiga(p2);
        p2.SetLiga(p3);
        p3.SetLiga(p4);
        p4.SetLiga(p5);





    }
}
