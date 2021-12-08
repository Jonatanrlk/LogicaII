package com.company;

public class Nodo
{
    private char letra;
    private Nodo liga;

    public Nodo(char pLetra)//Constructor
    {
        letra = pLetra;
        liga = null;
    }

    public char GetLetra()
    {
        return letra;
    }
    public void SetLetra(char pLetra)
    {
        letra = pLetra;
    }


    public Nodo GetLiga()
    {
        return liga;
    }
    public void SetLiga(Nodo pLiga)
    {
        liga = pLiga;
    }

}
