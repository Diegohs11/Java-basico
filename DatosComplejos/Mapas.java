package DatosComplejos;
import java.util.*;

public class Mapas {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("clave1", 10);
		mapa.put("clave2", 20);
		mapa.put("clave3",30);
		
		/**
		 * eliminarb valor
		 * mapa.remove("clave2");
		 */
		
		/**
		 * imprimir valor de una clave
		 * System.out.println(mapa.get("clave1"));
		 */
		
		//recorrer un mapa
		for(Map.Entry<String, Integer> elemento : mapa.entrySet()) {
			System.out.println("Elemento clave es: " + elemento.getKey());
			System.out.println("Elemento valor es: " + elemento.getValue());
		}

	}

}
