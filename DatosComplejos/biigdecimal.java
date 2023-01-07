package DatosComplejos;
import java.math.*;

public class biigdecimal {

	public static void main(String[] args) {
		
		
		BigDecimal valorA = new BigDecimal(3.14f);
		BigDecimal valorB = new BigDecimal(3.15f);
		//Sumar el bigDecimal
		BigDecimal resultado = valorA.add(valorB);
		
		System.out.println(resultado.toString());
		
	}
}