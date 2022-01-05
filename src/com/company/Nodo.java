package com.company;

public class Nodo
{
    private char letra;
    private Nodo liga;

    // Metodo Constructor

    public Nodo(char pLetra){
        letra = pLetra;
        liga=null;
    }

    //Metodos Getter y Setter

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
