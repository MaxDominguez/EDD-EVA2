package org.example;

public class EVA2_1_LISTA {
    public static void main(String[] args) {
        Nodo inicio = null;// sognifica lista vacia
        inicio = new Nodo(100);
        inicio.setSiguiente(new Nodo(200));
        inicio.getSiguiente().setSiguiente(new Nodo(300));

        Nodo temp = inicio;
        while (temp != null){
            System.out.println(temp.getValor() + " - ");
            temp = temp.getSiguiente();

        }
    }
}
class Nodo{
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        valor = 0;
        siguiente = null; // siempre siguiente debe ser null para que no falle el programa
    }
    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

