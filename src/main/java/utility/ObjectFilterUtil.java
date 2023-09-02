package utility;

import models.Objeto;

import java.util.function.Predicate;

public class ObjectFilterUtil {

    public static Predicate<Objeto> filterByValueMoreThan(final float valor){
        return (objeto)->objeto.getValorObjecto()>valor;
    }

    public static Predicate<Objeto> filterByWeightLessThan(final float peso){
        return (objeto)->objeto.getPesoObjecto()<peso;
    }
}
