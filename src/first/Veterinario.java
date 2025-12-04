/**
 * 
 */
package first;

/**
 * 
 */
public class Veterinario {

	
	public static void main(String[] args) {
		Perro primero= new Perro("Toby", "Golden", 2);
		Perro segundo= new Perro("Buddy", "Shelti", 3);
		Perro tercero= new Perro("Gio", "Chihuahua", 1);
		Perro cuarto= new Perro("Gio", "Chihuahua", 1);
		
		System.out.println("Bienvenidos a la clinica veterinaria\n");
		
		System.out.println("Perrito, como te llamas?");
		
		System.out.printf("Me llamo %s \n", primero.getName());

		System.out.println("\nY tu, cual es tu sexo?");
		
		tercero.setGender("hembra");
		System.out.printf("Yo soy %s, y soy %s\n", tercero.getName(),tercero.getGender());
		
		segundo.bark();

		
		System.out.println(primero.toString());
		System.out.println(segundo.toString());
		System.out.println(tercero.toString());
		
		if (primero.equals(tercero)) {
			System.out.println("Son el mismo perro");
		}else {System.out.printf("\n%s y %s son canidos distintos", primero.getName(), tercero.getName());}
		
		if (cuarto.equals(tercero)) {
			System.out.println("Son el mismo perro");
		}else {System.out.printf("\n%s y %s son canidos distintos", cuarto.getName(), tercero.getName());}
	}

}
