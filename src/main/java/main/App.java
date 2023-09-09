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
        Objeto[] elementos = {
                new Objeto("Calculadora", 12000F, 0.9F ),
                new Objeto("Cartuchera", 8000F, 1.6F ),
                new Objeto("Cuaderno", 9000F, 1.8F ),
                new Objeto("Juguete", 15000F, 3.5F ),
                new Objeto("Libro", 15000F, 2.5F ),
                new Objeto("Lonchera", 12000F, 5.9F ),
                new Objeto("Regla", 5000F, 0.6F ),
                new Objeto("Sombrilla", 13000F, 2.3F ),

        };
    }


    /**
     * Método que recibe un array con la lista de los objetos que hasta el momento se han
     * agregado a la mochila
     * @param elementos
     * @param indice
     * @return
     */
    public static int[] crearListaElementos(int[] elementos, int indice, float peso, int[] actual, int[] mejor, float mayorValor){
        if(indice > elementos.length-1){
            return elementos;
        }else {
            float pesos = sumarPesos(indice, peso);
            if(elementos[indice] == 0 &&  pesos < mochila.getCapacidad()){

                elementos[indice] = 1;
                float valor = sumarValoresObjetos(elementos,0,0);
                if(valor > mayorValor){
                    return crearListaElementos(elementos, ++indice, pesos, elementos, elementos, valor);
                }else{
                    return crearListaElementos(elementos, ++indice, pesos, elementos, mejor, mayorValor);
                }

                //return crearListaElementos(elementos, ++indice, pesos, );
            }else {
                return crearListaElementos(elementos, ++indice, pesos, elementos, mejor, mayorValor);
            }
        }
    }

    /**
     * Método auxiliar de sumar pesos permite identificar que elementos se guardaron en la mochila, y con base
     * a esto tomar su respectivo peso en kilogramos y acumularlo para evaluarlo en un condicional dentro
     * de la funcion crearListaElementos().
     * @param indice
     * @param suma
     * @return
     */
    /*public static float sumarPesos(int indice, float suma){
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
    }*/

    /**
     * Método auxiliar que toma los precios de los elementos agregados a la mochila, acumulandolos
     * para poder comprobar el total y compararlo posteriormente con las listas que el backtracking
     * genere.
     * @param array
     * @param indice
     * @param suma
     * @return
     */
    /*public static float sumarValoresObjetos(int[] array, int indice, float suma){
        if(indice > array.length-1){
            return suma;
        }else{
            if(array[indice] == 1){
                switch(indice){
                    case 0:
                        suma += calculadora.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 1:
                        suma += cartuchera.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 2:
                        suma += cuaderno.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 3:
                        suma += juguete.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 4:
                        suma += libro.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 5:
                        suma += lonchera.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 6:
                        suma += regla.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    case 7:
                        suma += sombrilla.getValorObjecto();
                        return sumarValoresObjetos(array, ++indice, suma);
                    default:
                        return suma;
                }
            }
        }
        return suma;
    }*/

    /**
     * Método recursivo que imprime los elementos dentro de un array.
     * @param lista
     * @param inicial
     * @param fin
     */
    public static void imprimirRecursivo(int[] lista, int inicial, int fin){

        if(inicial == fin){
            System.out.print(lista[inicial]);
        }else{
            System.out.print(lista[inicial] + " , ");
            imprimirRecursivo(lista, ++inicial, fin);

        }

    }
}
