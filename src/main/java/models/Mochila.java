package models;

import java.util.List;

public class Mochila {

    private int pesoMaximo;
    private Objeto[] elementos;

    private int peso;
    private int beneficio;

    public Mochila(int pesoMaximo, int numElementos) {
        this.pesoMaximo = pesoMaximo;
        this.elementos = new Objeto[numElementos];
        this.beneficio = 0;
        this.peso = 0;
    }

    public Objeto[] getElementos() {
        return elementos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    /**
     * Añade un elemento a la mochila
     * @param e
     */
    public void aniadirElemento(Objeto e) {

        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = e; //lo añade
                this.beneficio+=e.getValorObjecto(); // aumenta el beneficio
                this.peso+=e.getPesoObjecto(); // Aumenta el piso
                break;
            }
        }

    }

    /**
     * Vaciamos la mochila
     */
    public void clear() {
        this.peso=0;
        this.beneficio=0;
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = null;
        }
    }

    /**
     * Elimina elemento dado
     * @param e
     */
    public void eliminarElemento(Objeto e) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i].equals(e)) {
                this.elementos[i] = null; //el elemento fuera
                this.peso-=e.getPesoObjecto(); //Reduce el peso
                this.beneficio-=e.getValorObjecto(); // reduce el beneficio
                break;
            }
        }
    }

    /**
     * Indica si existe un elemento
     * @param e
     * @return
     */
    public boolean existeElemento(Objeto e) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra la mochila
     * @return
     */
    public String toString() {
        String cadena="";
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                cadena+=elementos[i]+" - ";
            }
        }
        cadena+="\n";
        cadena+="Peso: " + getPeso()+"\n";
        cadena+="Beneficio: " + getBeneficio()+"\n";
        return cadena;
    }
}
