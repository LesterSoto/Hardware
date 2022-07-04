public class ArbolBinarioBusquesda {
    private Nodo raiz;

    public ArbolBinarioBusquesda(){
        raiz = null;
    }
    public boolean estaVacio(){
        return raiz == null;
    }
    private void insertar(Nodo padre, Nodo hijo, int dato){
        if(hijo == null){
            Nodo nuevo = new Nodo(null,dato,null);
            if(dato >= padre.getDato()) {
                padre.setDerecho(nuevo);
            }else{
                padre.setIzquierdo(nuevo);
            }
        }else{
            if(dato >= padre.getDato()){
                insertar(hijo,hijo.getDerecho(), dato);
            }else{
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }
    public void insertar(int dato){
        if (estaVacio()){
            Nodo nuevo = new Nodo(null,dato,null);
            raiz = nuevo;
        }else{
            if (dato >= raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else{
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }
    private void mostrarInOrder(Nodo nodo){
        if (nodo == null){

        }else{
            mostrarInOrder(nodo.getIzquierdo());
            System.out.print(nodo.getDato()+" ");
            mostrarInOrder(nodo.getDerecho());
        }
    }
    public void mostrarInOrder(){
        Nodo temp = raiz;
        mostrarInOrder(raiz);
        System.out.println();
    }
}
