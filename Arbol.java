package TareaArbol;

public class Arbol {
	
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    //Metodo vacio
    public boolean vacio() {
        return raiz == null;
    }

    //Metodo buscarNodo
    public Nodo buscarNodo(String name) {
        return buscarNodo(raiz, name);
    }

    private Nodo buscarNodo(Nodo nodo, String name) {
        if (nodo == null || nodo.getname() == name) {
            return nodo;
        }
        if (name.length() <= nodo.getname().length()) {
            return buscarNodo(nodo.getleft(), name);
        }
        return buscarNodo(nodo.getright(), name);
    }

    //Metodo insertar
    public void insertar(String name) {
        raiz = insertarNodo(raiz, name);
    }

    private Nodo insertarNodo(Nodo nodo, String name) {
        if (nodo == null) {
            nodo = new Nodo(name);
            return nodo;
        }
        if (name.length() <= nodo.getname().length()) {
            nodo.setleft(insertarNodo(nodo.getleft(), name));
        } else if (name.length() > nodo.getname().length()) {
        	nodo.setright(insertarNodo(nodo.getright(), name));
        }
        return nodo;
    }

    //Metodo imprimirArbol
    public void imprimirArbol() {
        imprimirArbol(raiz);
    }

    private void imprimirArbol(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getname());
            imprimirArbol(nodo.getleft());
            imprimirArbol(nodo.getright());
        }
    }
}