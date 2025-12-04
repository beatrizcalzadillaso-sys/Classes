package first;

public class Perro {
	
	// ATRIBUTOS
	private String name;
	private String breed;
	private String gender;
	private int age=0;
	private double weight;
	private double height;
	private boolean vaccinated=false;
	
	
	
	public void bark() {
		System.out.printf("\nWoof woof, mi nombre es %s, yo soy %s%n", name,breed);
	}
	
	public void play() {
		System.out.println("Vamos a jugar!!");
	}

	public Perro(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}


	
/*	public Perro(String name, String gender, double weight, double height, boolean vaccinated) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.vaccinated = vaccinated;
	} 									*/
	
	

	@Override
	public String toString() {
		return "\nPerro [name=" + name + ", breed=" + breed + ", gender=" + gender + ", age=" + age + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}



	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}



	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}



	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}



	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}



	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}



	/**
	 * @return the vaccinated
	 */
	public boolean isVaccinated() {
		return vaccinated;
	}



	/**
	 * @param vaccinated the vaccinated to set
	 */
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}


	

}
