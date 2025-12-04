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
		
		public static String[] tipoMotor= new String[] {"desconocido", "diesel", "gasolina"};
	
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
	
	/**
	 * @return the tipoMotor
	 */
/*	public String getTipoMotor() {
		if (motor==0) {
			tipoMotor= "desconocido";
		}
		else if (motor==1) {
			tipoMotor= "diesel";
		}
		else {
			tipoMotor= "gasolina";
		}
		return tipoMotor;		// NO ESTA EJECUTANDO ESTA FUNCION
	}																	*/
	
	
	@Override
	public String toString() {
		return "Taxi {\n\t provincia= " + provincia + "\n\t matricula= " + matricula + "\n\t municipio= " + municipio + "\n\t motor= "
				+ tipoMotor[motor] + "\t}";
	}
	
	
	
	public Taxi(String provincia, String matricula, String municipio, int motor) {
		this.provincia = provincia;
		this.matricula = matricula;
		this.municipio = municipio;
		this.motor = motor;
	}
	
}
