package main;

import models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Objeto> lista = new ArrayList<>();
        Mochila mochila = new Mochila(15.0F, lista); // peso dado en Kilogramos

        Calculadora calculadora = new Calculadora(45.000F, 2.5F);
        Cartuchera cartuchera = new Cartuchera(10.000F, 1.8F);
        Cuaderno cuaderno = new Cuaderno(19.500F, 3.8F);
        Juguete juguete = new Juguete(35.000F, 5.2F);
        Libro libro = new Libro(15.000F, 2.8F);
        Lonchera lonchera = new Lonchera(6.000F, 4.6F);
        Regla regla = new Regla(2.700F, 0.8F);
        Sombrilla sombrilla = new Sombrilla(12.000F, 1.3F);


    }
}
