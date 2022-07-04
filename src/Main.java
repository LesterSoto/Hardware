public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusquesda arbol = new ArbolBinarioBusquesda();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(6);
        arbol.insertar(4);

        arbol.mostrarInOrder();

        arbol.insertar(7);
        arbol.insertar(10);
        arbol.insertar(9);

        arbol.mostrarInOrder();
    }
}
