package org.example;

public class Lista {
    private Nodo inicio;

    public Lista(){
        inicio = null;

    }
    public void AgregarNodo(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo temp = inicio;

        if (inicio == null)
            inicio = nuevo;
        else{
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();

            }
            temp.setSiguiente(nuevo);

        }
    }
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
}
