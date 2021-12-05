package com.company;

public class Nodo {
    //Atributos
    private int numero;
    private Nodo liga;

    //Constructor
    public Nodo(int pNumero)
    {
        numero = pNumero;
        liga = null;
    }

    // Metodos Get y Set del Atributo Numero

    public int GetNumero()
    {
        return numero;
    }
    public void SetNumero(int pNumero)
    {
        numero = pNumero;
    }

    //Metodos Get y Set Atributo Liga

    public Nodo GetLiga()
    {
        return liga;
    }
    public void SetLiga(Nodo pLiga)
    {
        liga = pLiga;
    }

}
