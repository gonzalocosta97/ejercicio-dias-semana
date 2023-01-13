package ar.com.gonzacostaweb.ejercicio_dias_semana;
import java.util.*;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		String[] diasSemana = {"lunes", "martes", "mi�rcoles", "jueves", "viernes", "s�bado", "domingo"};
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Ingrese un d�a de la semana: ");
		
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
			
			
			if(diaIngresado.equals("s�bado") || diaIngresado.equals("domingo")) {
				
				System.out.println("El " + diaIngresado + " es un d�a del fin de semana.");
				
			} else {
				
				System.out.println("El " + diaIngresado + " es un d�a h�bil.");
				
			}
		
			
		} else {
			
			System.out.println("La palabra ingresada est� mal escrita o no es un d�a de semana.");
			
		}
		
		entrada.close();
		
		
	}

}
