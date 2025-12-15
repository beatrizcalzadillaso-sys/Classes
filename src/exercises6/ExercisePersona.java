/**
 * 
 */
package exercises6;

import java.util.Scanner;

/**
 *  NO HAY VALIDACIONES
 */
public class ExercisePersona {

	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		Persona uno= new Persona();
		Persona dos= new Persona();
		
		System.out.print("Teclee el nombre de persona Uno: ");
		uno.setNombre(keyboard.nextLine());
		System.out.print("\nTeclee el apellido de persona Uno: ");
		uno.setApellidos(keyboard.nextLine());
		System.out.print("\nTeclee la edad de persona Uno: ");
		uno.setEdad(Integer.parseInt(keyboard.nextLine()));
		System.out.print("\nTeclee si true/false persona Uno es casada o no: ");
		uno.setCasado(Boolean.parseBoolean(keyboard.nextLine()));  
		System.out.print("\nTeclee el DNI de la persona Uno:");
		uno.setNumDocIdent(keyboard.nextLine());
		
		System.out.println("--------------------\n");
		// PERSONA 2
		System.out.print("\nTeclee el nombre de persona Dos: ");
		dos.setNombre(keyboard.nextLine());
		System.out.print("\nTeclee el apellido de persona Dos: ");
		dos.setApellidos(keyboard.nextLine());
		System.out.print("\nTeclee la edad de persona Dos: ");
		dos.setEdad(Integer.parseInt(keyboard.nextLine()));
		System.out.print("\nTeclee si true/false persona Dos es casada o no: ");
		dos.setCasado(Boolean.parseBoolean(keyboard.nextLine()));
		System.out.print("\nTeclee el DNI de la persona Dos:");
		dos.setNumDocIdent(keyboard.nextLine());
		
		System.out.println("--------------------\n");
		System.out.println("Las personas son: \n");
		System.out.println(uno.toString());
		System.out.println(dos.toString());  
		
		esMayor(uno,dos);
	}
	
	public static void esMayor(Persona primera, Persona segunda) {
		int edad1= primera.getEdad();
		int edad2= segunda.getEdad();
		
		if(edad1>edad2) {
			System.out.printf("La mayor es %-10s %-15s", primera.getNombre(), primera.getApellidos());
		}
		else {System.out.printf("La mayor es %-10s %-15s", segunda.getNombre(), segunda.getApellidos());}
		
	}
}


