/**
 * 
 */
package exercises6;

/**
 * 
 */
public class Coche {

	// ATRIBUTOS
	private int velocidad;
	
	public Coche() {
		velocidad=0;
	}

	/**
	 * @return the velocidad
	 */
	private int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	private void acelera(int mas) {
		this.velocidad = velocidad+mas;
	}
	
	private void frena(int menos) {
		this.velocidad = velocidad+menos;
	}

	public Coche(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}
	
	
	
}
