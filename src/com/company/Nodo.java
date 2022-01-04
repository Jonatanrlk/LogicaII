package com.company;

public class Nodo
{
    private char letra ;

    private Nodo liga;

    // Metodo Constructor

    public Nodo(char pLetra){
        letra = pLetra;
        liga = null;
    }

    // Metodos Getter y Setter

    public char GetLetra(){
        return letra;
    }
    public void SetLetra(char pLetra){
        letra = pLetra;
    }

    public Nodo GetLiga(){
        return liga;
    }
    public void SetLiga(Nodo pLiga){
        liga = pLiga;
    }


}
