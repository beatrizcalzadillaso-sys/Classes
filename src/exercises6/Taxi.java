/**
 * 
 */
package exercises6;

public class Taxi {

	// ATRIBUTOS
		private String provincia= "Bizkaia";
		private String matricula;
		private String municipio;
		private int motor; // HAY QUE DEFINIR QUE VALORES PUEDE TOMAR??
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the motor
	 */
	public int getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(int motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Taxi {\n provincia= " + provincia + "\n matricula= " + matricula + "\n municipio= " + municipio + "\n motor= "
				+ motor + " }";
	}
	public Taxi(String provincia, String matricula, String municipio, int motor) {
		this.provincia = provincia;
		this.matricula = matricula;
		this.municipio = municipio;
		this.motor = motor;
	}
	
}
