package models;

import java.util.List;

public class Mochila {

    private float capacidad;

    private List<Objeto> listaObjectos;

    public Mochila() {
    }

    public Mochila(float capacidad, List<Objeto> listaObjetos) {
        this.capacidad = capacidad;
        this.listaObjectos = listaObjetos;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public List<Objeto> getListaObjectos() {
        return listaObjectos;
    }

    public void setListaObjectos(List<Objeto> listaObjectos) {
        this.listaObjectos = listaObjectos;
    }
}
