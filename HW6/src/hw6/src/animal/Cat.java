package hw6.src.animal;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void greeting() {
		System.out.println("Meow");
	}
}

