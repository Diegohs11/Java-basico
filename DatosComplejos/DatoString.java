package DatosComplejos;

public class DatoString {

	public static void main(String[] args) {
		
		String cadena = "Mensaje de texto";
		
		/**
		 * Medir longitud de cadena
		 * int cadenalen = cadena.length();
			System.out.println("La longitud de mi cadena es: " + cadenalen);
		 */
		
		/**Pasar cadena de texto a minuscula
		 * String cadenaMinus = cadena.toLowerCase();
		System.out.println("La cadena ahora es: " + cadenaMinus);
		 */
		
		/**
		 * Pasar cadena de texto en mayuscula
		 * String cadenaMayus = cadena.toUpperCase();
		System.out.println("La cadena ahora es: " + cadenaMayus);
		 */
		
		/**
		 * Comparar si un mensaje comienza con ciertaas lettras
		 * boolean resultado = cadena.startsWith("Men");
		if(resultado) {
			System.out.println("Empieza por lo que estoy buscando");
		} else {
			System.out.println("No empieza por lo que quiero");
		}
		 */
		
		
		/**
		 * Comparar si un mensaje termina con ciertas lettras
		 *  boolean resultado = cadena.endsWith("o");
		if(resultado) {
			System.out.println("Si acaba");
		} else {
			System.out.println("No acaba");
		}
		 */
		
		 /**
		  * Caracer en cierta posicion
		  * char letra = cadena.charAt(0);
		System.out.println("Caracter es: " + letra);
		  */
		
		/**
		 * Recorrer cadena de texto
		 * for(int i=0; i< cadena.length(); i++) {
			System.out.println("Caracter actual es: " + cadena.charAt(i));
		}
		 */
		
		
		String invertida = "";
		for(int i =cadena.length() -1; i>0; i-- ) {
			invertida += cadena.charAt(i);
		}
		System.out.println(invertida);
	}

}
