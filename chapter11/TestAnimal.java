package chapter11;

public class TestAnimal {
public static void speaktry(Animal animal){
	animal.speak();
}
	public static void main(String[] args) {
		Animal animal=new Animal("Hayvan");
		Bird bird =new Bird("Limon");
		Dog dog=new Dog("Karaba�");
		Horse horse =new Horse("�ahbatur");
		
		speaktry(new Bird("Limon"));
		speaktry(new Dog("Karaba�"));
		speaktry(new Horse("�ahbatur"));
		
		
	}

	 }
	
	
