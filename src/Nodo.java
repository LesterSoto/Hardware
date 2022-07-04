public class Nodo {
    private Nodo izquierdo;
    private Nodo derecho;
    private int dato;

    public Nodo(Nodo izquierdo, int dato, Nodo derecho) {
        this.setIzquierdo(izquierdo);
        this.setDerecho(derecho);
        this.setDato(dato);
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
