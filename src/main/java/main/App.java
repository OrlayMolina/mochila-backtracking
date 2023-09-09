package main;

import models.Elemento;
import models.Mochila;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Elemento[] elementos = {
                new Elemento(5, 2000, "Calculadora"),
                new Elemento(2, 1000, "Cartuchera"),
                new Elemento(3, 3000, "Cuaderno"),
                new Elemento(1, 6000, "Libro"),
                new Elemento(3, 7000, "Lonchera"),
                new Elemento(2, 300, "Regla"),
                new Elemento(1, 4000, "Sombrilla"),

        };

        Mochila m_base = new Mochila(8, elementos.length);
        Mochila m_opt = new Mochila(8, elementos.length);

        llenarMochila("", m_base, elementos, false, m_opt);

        System.out.println("Solución óptima:");
        System.out.println(m_opt);
    }

    public static void llenarMochila(String ident, Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {

        ident += "  ";

        //si esta llena
        if (llena) {
            System.out.println(ident+"Se llenó");

            //compruebo si tiene mas beneficio que otra
            if (m_base.getBeneficio() > m_opt.getBeneficio()) {

                System.out.println(ident+"Asignó nueva óptima");
                Elemento[] elementosMochBase = m_base.getElementos();
                m_opt.clear();

                //metemos los elementos
                for (Elemento e : elementosMochBase) {
                    if (e != null) {
                        m_opt.aniadirElemento(e);
                    }

                }

            }

        } else {
            //Recorre los elementos
            for (int i = 0; i < elementos.length; i++) {
                String aux = m_base.existeElemento(elementos[i])==true? " ya existe ":" no existe";
                //System.out.println(ident+"Validando i="+i+" elemento + "+elementos[i].toString()+aux);
                //si existe el elemento
                if (!m_base.existeElemento(elementos[i])) {
                    //Si el peso de la mochila se supera, indicamos que esta llena
                    if (m_base.getPesoMaximo() >= m_base.getPeso() + elementos[i].getPeso()) {
                        System.out.println(ident+"i="+i+" agregó elemento de la posición: "+i +" ("+elementos[i].toString()+")");
                        m_base.aniadirElemento(elementos[i]); //añadimos
                        llenarMochila(ident, m_base, elementos, false, m_opt);

                        System.out.println(ident+"i="+i+" Eliminó elemento de la posición: "+i+" ("+elementos[i].toString()+")");
                        m_base.eliminarElemento(elementos[i]); // lo eliminamos
                    } else {
                        llenarMochila(ident, m_base, elementos, true, m_opt);
                    }

                }

            }
            llenarMochila(ident, m_base, elementos, true, m_opt);

        }

    }

}