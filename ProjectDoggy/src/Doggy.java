
public class Doggy {

	private String name;
	private int age;
	private int heightInches;
	private String breed;

	public Doggy(String name, int age, int heightInches, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.heightInches = heightInches;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeightInches() {
		return heightInches;
	}

	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
