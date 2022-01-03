package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
//        ListaLigada objeto = new ListaLigada();
//
//        int guardaNumero;
//
//
//        guardaNumero = objeto.MostraLista();
//
//        while(guardaNumero != 0){
//            System.out.println(guardaNumero+" ");
//             guardaNumero= objeto.MostraLista();
//        }
//
        Menu();

    }

    public static char Menu()
    {
        Scanner input = new Scanner(System.in);
        char opcion;
        System.out.println("Menu De Opciones");
        System.out.println("1.Mostrar Lista");
        System.out.println("2.Ingresar un Nuevo Numero");
        System.out.println("3.Eliminar el numero menor");
        System.out.println("4.Insectar un numero Despues otro que entro como parametro");
        System.out.println("5.Cuantos negativos hay");
        System.out.println("6.Salir");

        do {
            System.out.println("Ingresar : ");
            opcion = input.next().charAt(0);
        }while(opcion < '1' || opcion > '6');

        return opcion;
    }
}
