package DatosComplejos;
import java.util.*;
public class Vectores {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>(16);
		
		//10 int de inicio
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		/**
		 * vector.add(3);
		 * System.out.println("datos del vector: " + vector);
		 */
		
		
		/**
		 * borrar elemento
		 * vector.remove(2);
		System.out.println("Datos del vector" + vector);
		 */
		
		
		/**Ver tamaño y capacidad
		 * System.out.println("Vector tamaño: " + vector.size() + ", y capacidad: " + vector.capacity());
		 */
		
		/**
		 * omparar vetores
		 * Vector<Integer> vector2 = new Vector();
		vector2.add(1);
		vector2.add(2);
		
		boolean resultado = vector.equals(vector2);
		System.out.println("Son iguales? " + resultado);
		 */
		
		/**
		 * recorrer vector
		 * for(int i : vector) {
			System.out.println("Valor actual del vector: " + i);
		}
		
		//Forma larga de recorrer
		for(int i = 0; i < vector.size() - 1; i++) {
			if(i % 2 == 0) {
				vector.remove(i);
				continue;
			}
			System.out.println("Valor actual: " + vector.get(i) + ", en posicion: " + i);
		}
		 */
		
		//reducir caapacidad del vector
		System.out.println("Capacidad: " + vector.capacity() + ", tamaño: " + vector.size());
		vector.trimToSize();
		System.out.println("Capacidad: " + vector.capacity() + ", tamaño: " + vector.size());		
	}

}
