package utility;

import models.Objeto;

import java.util.function.Predicate;

public class ObjectFilterUtil {

    /**
     * Método que permite comprobar que lista es la que contiene mayor valor en los elementos
     * que la componen.
     * @param valor
     * @return
     */
    public static Predicate<Objeto> filterByValueMoreThan(final float valor){
        return (objeto)->objeto.getValorObjecto()>valor;
    }

    /**
     * Método que permite llevar el control del peso máximo permitido a la mochila.
     * @param peso
     * @return
     */
    public static Predicate<Objeto> filterByWeightLessThan(final float peso){
        return (objeto)->objeto.getPesoObjecto()<peso;
    }
}
