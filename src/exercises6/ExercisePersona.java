/**
 * 
 */
package exercises6;

import java.util.Scanner;

/**
 * 
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
		System.out.print("\nTeclee el DNI de la persona 1:");
		uno.setNumDocIdent(keyboard.nextLine());
		
		
		// PERSONA 2
		System.out.print("Teclee el nombre de persona Dos");
		dos.setNombre(keyboard.nextLine());
		System.out.print("\nTeclee el apellido de persona Dos");
		dos.setApellidos(keyboard.nextLine());
		System.out.print("\nTeclee la edad de persona Uno");
		dos.setEdad(Integer.parseInt(keyboard.nextLine()));
		System.out.print("\nTeclee si true/false persona Dos es casada o no");
		dos.setCasado(Boolean.parseBoolean(keyboard.nextLine()));
		System.out.print("\nTeclee el DNI de la persona 1");
		dos.setNumDocIdent(keyboard.nextLine());
	}
}


