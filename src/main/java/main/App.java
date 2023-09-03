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

    static Calculadora calculadora = new Calculadora(45.000F, 2.5F);
    static Cartuchera cartuchera = new Cartuchera(10.000F, 1.8F);
    static Cuaderno cuaderno = new Cuaderno(19.500F, 3.8F);
    static Juguete juguete = new Juguete(35.000F, 5.2F);
    static Libro libro = new Libro(15.000F, 2.8F);
    static Lonchera lonchera = new Lonchera(6.000F, 4.6F);
    static Regla regla = new Regla(2.700F, 0.8F);
    static Sombrilla sombrilla = new Sombrilla(12.000F, 1.3F);
    static List<Objeto> lista = new ArrayList<>();
    static Mochila mochila = new Mochila(15.0F, lista); // peso dado en Kilogramos

    public static void main( String[] args )
    {
        int inicial = 0;
        int[] elementos = {0, 0, 0, 0, 0, 0};


        int[] elementosGuardados = crearListaElementos(elementos, 0, 0);
        imprimirRecursivo(elementosGuardados, inicial, elementosGuardados.length-1);
    }


    /**
     * Método que recibe un array con la lista de los objetos que hasta el momento se han
     * agregado a la mochila
     * @param elementos
     * @param indice
     * @return
     */
    public static int[] crearListaElementos(int[] elementos, int indice, float peso){
        if(indice > elementos.length-1){
            return elementos;
        }else {
            float pesos = sumarPesos(indice, peso);
            if(elementos[indice] == 0 &&  pesos < mochila.getCapacidad()){
                elementos[indice] = 1;
                return crearListaElementos(elementos, ++indice, pesos);
            }else {
                return crearListaElementos(elementos, ++indice, pesos);
            }
        }
    }

    public static float sumarPesos(int indice, float suma){
        switch(indice){
            case 0:
                suma += calculadora.getPesoObjecto();
                break;
            case 1:
                suma += cartuchera.getPesoObjecto();
                break;
            case 2:
                suma += cuaderno.getPesoObjecto();
                break;
            case 3:
                suma += juguete.getPesoObjecto();
                break;
            case 4:
                suma += libro.getPesoObjecto();
                break;
            case 5:
                suma += lonchera.getPesoObjecto();
                break;
            case 6:
                suma += regla.getPesoObjecto();
                break;
            case 7:
                suma += sombrilla.getPesoObjecto();
                break;
            default:
                return suma;
        }
        return suma;
    }

    public static void imprimirRecursivo(int[] lista, int inicial, int fin){

        if(inicial == fin){
            System.out.print(lista[inicial]);
        }else{
            System.out.print(lista[inicial] + " , ");
            imprimirRecursivo(lista, ++inicial, fin);

        }

    }
}
