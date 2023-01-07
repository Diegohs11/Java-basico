package DatosComplejos;

public class DatoArray {
	
	public static void main(String[] args) {
		
		//int arrayUno[] = new int[5];
		//arrayUno[0] = 1;
		//arrayUno[1] = 2;
		//arrayUno[2] = 3;
		//arrayUno[3] = 4;
		//arrayUno[4] = 5;
		
		/**
		 * int arrayUno[] = {1,2,3,4,5};
		 * for(int i : arrayUno) {
			System.out.println(i);
		}
		
		 */
		
		
		/**
		 * String nombres[] = {
		 * 		"Pepe",
				"Juan",
				"Franisco",
		};
		//saber longitud 
		System.out.println("La longitud del array: " + nombres.length);
		
		//reorrer array 1
		for(String nombre : nombres) {
			System.out.println("Nombre  actual: " + nombre);
		}
		
		//reorrer array 1
		
		String ultimoNombre = "";
		
		for(int i= 0; i < nombres.length; i++) {
			System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);
			//Sacar ultimo nombre
			//ultimoNombre = nombres[i];
		}
		 */
		
		
		//Arrays bidimensional
		/**
		 * pimer forma
		 * int arrayBidi[][] = new int [2][4];
		arrayBidi[0][0] = 1;
		arrayBidi[0][1] = 2;
		arrayBidi[0][2] = 3;
		arrayBidi[0][3] = 4;
		
		arrayBidi[1][0] = 10;
		arrayBidi[1][1] = 20;
		arrayBidi[1][2] = 30;
		arrayBidi[1][3] = 40;
		 */
		
		//segunda forma
		//2 filas x 4 olumns
		int arrayBidi[][]= {
				{1, 2, 3, 4},
				{10, 20, 30, 40}
		};
		
		//Filas
		for(int i = 0; i < arrayBidi.length; i++) {
			System.out.println("Valor de i: " + i);
			
			//columnas
			for(int j = 0; j < arrayBidi[i].length; j++) {
				System.out.println("Estoy en i = " + i + ", j = " + j);
				System.out.println(arrayBidi[i][j]);
			}
		}
	}

}
