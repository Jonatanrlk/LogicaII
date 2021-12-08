package com.company;

public class Nodo
{
    private int numero;
    private Nodo liga;

    public Nodo(int pNumero)//Constructor
    {
        numero = pNumero;
        liga = null;
    }

    public int GetNumero()
    {
        return numero;
    }
    public void SetNumero(int pNumero)
    {
        numero = pNumero;
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
