package org.generation.excercise;
/*Programa que permite que un usuario agregue nombre completo de estudiantes matriculados en una universidad. Posteriomente, muestra la lista de los estudiantes agregados.
 * 
 * >Utilizar un Arraylist
 * >Scanner para interactuar con el usuario
 * >Loop para solicitar una y otra vez el nombre del estudiante(do-while). 
 * >Break opción para salir del loop con la palabra "Salir" (If-else, try-catch, ≠ , switch)
 * >Mostrar lista de estudiantes estudiantes (For each)
 * 
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {
	public static void main(String[] args) {
		//***Inicializar un array list para guardar a los estudiantes***
		ArrayList<String>estudiantes = new ArrayList<String>();
		
		//***Scanner para interactuar con el usuario***
		Scanner scanner = new Scanner(System.in);
		
		// ***Do while***
		String nombreEstudiante = scanner.nextLine(); //Iniciaizamos de manera global
		do {
			System.out.println("Ingresa el nombre del estudiante o ecribe 'Salir' para abandonar el programa");
			nombreEstudiante = scanner.nextLine(); //Llamar de forma local
			estudiantes.add(nombreEstudiante);
			
		//***Guardarlo en una varibale local***	
		} while(!nombreEstudiante.equalsIgnoreCase("Salir")); //Siempre que NO se escriba salir, el cilco contúa en ejecución.
		
		//***Mostrar la lista de los estudiantes***
		System.out.println("*********Lista de estudiantes: ");
			for (String estudiante : estudiantes) {
				//Si no quiero que se muestre la palabra "Salir" voy a agregar una condicion sobre la variable que guarda a los elementos que iteran sobre el ArrayList
				if (!estudiante.equalsIgnoreCase("Salir")) {
					System.out.println(estudiante);
				} 
				
			}
		
		scanner.close(); 
		
		
		

		
		
		
	}
}
