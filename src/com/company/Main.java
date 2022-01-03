package com.company;

public class Main
{
    public static void main(String[] args)
    {
        ListaLigada objeto = new ListaLigada();

        int guardaNumero;


        guardaNumero = objeto.MostraLista();

        while(guardaNumero != 0){
            System.out.println(guardaNumero+" ");
             guardaNumero= objeto.MostraLista();
        }

    }
}
