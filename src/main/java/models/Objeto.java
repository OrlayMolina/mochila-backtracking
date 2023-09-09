package models;

public class Objeto {

    private String nombre;
    private float valorObjeto;

    private float pesoObjeto;

    public Objeto(){

    }

    public Objeto(String nombre, float valorObjecto, float pesoObjecto) {
        this.nombre = nombre;
        this.valorObjeto = valorObjecto;
        this.pesoObjeto = pesoObjecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorObjecto() {
        return valorObjeto;
    }

    public void setValorObjecto(float valorObjecto) {
        this.valorObjeto = valorObjecto;
    }

    public float getPesoObjecto() {
        return pesoObjeto;
    }

    public void setPesoObjecto(float pesoObjecto) {
        this.pesoObjeto = pesoObjecto;
    }
}
