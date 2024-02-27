package TareaArbol;

public class Main {
	
    public static void main(String[] args) {
    	
        Arbol arbol = new Arbol();

        //Metodo vacio
        System.out.println(arbol.vacio()? "Arbol vacio" : "Arbol no vacio" );
        
        //Se insertan los datos
        arbol.insertar("a");
        arbol.insertar("b");
        arbol.insertar("c");
        arbol.insertar("d");
        System.out.println("Los Datos han sido insertados");
        
        //Buscar Nodo
        System.out.print("Se encontro el ");
        System.out.println(arbol.buscarNodo("a"));
        
        //Imprimir
        System.out.println("Arbol:");
        arbol.imprimirArbol();
        
    }
    
}