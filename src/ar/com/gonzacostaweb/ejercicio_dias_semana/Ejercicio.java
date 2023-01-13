package ar.com.gonzacostaweb.ejercicio_dias_semana;
import java.util.*;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Ingrese un día de la semana: ");
		
		System.out.println();
		
		String diaIngresado = entrada.next().toLowerCase();
		
		System.out.println();
		
		boolean checkDiaIngresado = false;
		
		for(int i = 0; i < diasSemana.length; i++) {
			
			if(diaIngresado.equals(diasSemana[i])) {
				
				checkDiaIngresado = true;
				
			}
			
		}
		
		if(checkDiaIngresado) {
			
			
			if(diaIngresado.equals("sábado") || diaIngresado.equals("domingo")) {
				
				System.out.println("El " + diaIngresado + " es un día del fin de semana.");
				
			} else {
				
				System.out.println("El " + diaIngresado + " es un día hábil.");
				
			}
		
			
		} else {
			
			System.out.println("La palabra ingresada está mal escrita o no es un día de semana.");
			
		}
		
		entrada.close();
		
		
	}

}
