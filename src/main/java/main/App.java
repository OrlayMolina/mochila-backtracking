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

    /**
     * Método que verificará si la cantidad de elementos en el ArrayList es menor de 6
     * para permitir que se puedan agregar más elementos, de no ser así no se podrá
     * agregar más elementos al ArrayList que representa el limite arbitrario definido.
     * @param lista
     * @return
     */
    public static boolean validarNumeroElemento(List<Objeto> lista){
        if(lista.size() < 7){
            return true;
        }else {
            return false;
        }
    }
}
