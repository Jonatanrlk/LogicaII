package com.company;

public class Main {

    public static void main(String[] args)
    {
        Nodo x , y , z , p ;

        x = new Nodo('a');
        y = new Nodo('b');
        z = new Nodo('c');

        /*
        Aqui se ligaron los tres primero nodos x , y , z
         */

        x.SetLiga(y);
        y.SetLiga(z);

        //insertando nuevo nodo (Nodo y , ya no tiene el dato 'b' )

        y = new Nodo('f');


        // mostrando Informacion

        p = x.GetLiga();
        System.out.println(""+p.GetLetra());

        /*
        En la siguiente , como el 'nodo y' se desligo y al desligarse
        tambien desligo al Nodo z.

        Entonces lo vamos a incorporar a la lista de nuevo
         */
        x.GetLiga().SetLiga(y);


        // aqui volvemos a ligar al Nodo z a la lista

        y.SetLiga(z);

        /*
        Para utilizar todo una lista  basta solo con tener la direccion
        de memoria del primer Nodo asi :
         */
        Nodo puntero = x;

        /*sabemos que x guarda la direccion de memoria del primer Nodo
        y ademas en su Liga tiene la direccion de memoria del segundo Nodo
        y el segundo Nodo tambien tiene en su liga la Direecion del siguiente Nodo
        Asi podemos irnos sucesivamente hasta el ultimo Nodo de la lista

        sabiendo esto la direccion de memoria del primer Nodo se puede guardar
        en una variable Puntera la cual es la cabeza de la lista.
        y en consecuencia nuestras variables x , y , z ya no las vamos a estar
        utilizando
         */

        y = x = z = null;

        /*
        Ahora  , como ya nuestros nodos estan ligados
        podemos recorerla con un ciclo especificamente
        con bucle While.

        El ciclo terminara cuando llege al ultimo Nodo el cual
        tiene en su Liga null .
         */
        while (p != null){

            System.out.println(""+p.GetLetra());

            p = p.GetLiga();
        }











    }
}
