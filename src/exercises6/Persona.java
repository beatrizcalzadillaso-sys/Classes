/**
 * 
 */
package exercises6;

/**
 * 
 */
public class Persona {
	
	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numDocIdent;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the casado
	 */
	public boolean isCasado() {
		return casado;
	}
	/**
	 * @param casado the casado to set
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	/**
	 * @return the numDocIdent
	 */
	public String getNumDocIdent() {
		return numDocIdent;
	}
	/**
	 * @param numDocIdent the numDocIdent to set
	 */
	public void setNumDocIdent(String numDocIdent) {
		this.numDocIdent = numDocIdent;
	}
	// CONSTRUCTOR A POPULAR LOS ATRIBUTOS
	public Persona() {
	}
	
	//  CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Persona(String nombre, String apellidos, int edad, boolean casado, String numDocIdent) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.numDocIdent = numDocIdent;
	}
	
	
	
}
