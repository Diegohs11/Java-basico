package DatosComplejos;
import java.util.*;
public class ArrayLista {

	public static void main(String[] args) {
		
		//iniciar un ArrayList
		ArrayList <String> lista = new ArrayList<>();
		lista.add("Elemento A");
		lista.add("Elemento B");
		lista.add("Elemento C");
		
		/**
		 * Quitar un elemento
		 * lista.remove(2);
		System.out.println("Contenido: " + lista);
		 */
		
		
		/**
		 * Reorrer ArrayList
		 * //primera forma
		for(String nombre : lista) {
			System.out.println(nombre);
		}
		//segunda forrma
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		 */
		
		/**
		 * onvertir Arraylist en Array
		 * String array[]= new String[lista.size()];
		//convertir recorriendo la lista
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		for( String elemento : array) {
			System.out.println("Elemento es : " + elemento);
		}
		 */
		
		//reorrer una conversion al mismo tiempo que se recorre
		for(Object arrayObjet : lista.toArray()) {
			System.out.println(arrayObjet.toString());
		}
	}

}
