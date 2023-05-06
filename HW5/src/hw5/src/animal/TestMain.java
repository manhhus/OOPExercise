package hw5.src.animal;

public class TestMain {
    
	public static void main(String[] args) {
		
		Animal animal = new Animal("Umu");
		System.out.println(animal);
		Animal mammal = new Mammal("Hoo");
		System.out.println(mammal);
		Animal cat = new Cat("Neko");
		System.out.println(cat);		
		Dog dog = new Dog("UwU");
		System.out.println(dog);
		dog.greets();
		animal = new Dog("UmU");
		dog.greets((Dog) animal);

	}
}