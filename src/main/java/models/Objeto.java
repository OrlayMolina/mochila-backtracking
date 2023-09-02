package models;

public class Objeto {

    private float valorObjecto;

    private float pesoObjecto;

    public Objeto(float valorObjecto, float pesoObjecto) {
        this.valorObjecto = valorObjecto;
        this.pesoObjecto = pesoObjecto;
    }

    public float getValorObjecto() {
        return valorObjecto;
    }

    public void setValorObjecto(float valorObjecto) {
        this.valorObjecto = valorObjecto;
    }

    public float getPesoObjecto() {
        return pesoObjecto;
    }

    public void setPesoObjecto(float pesoObjecto) {
        this.pesoObjecto = pesoObjecto;
    }
}
