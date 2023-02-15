package chapter11;

public class TestAnimal {
public static void speaktry(Animal animal){
	animal.speak();
}
	public static void main(String[] args) {
		Animal animal=new Animal("Hayvan");
		Bird bird =new Bird("Limon");
		Dog dog=new Dog("Karabaþ");
		Horse horse =new Horse("Þahbatur");
		
		speaktry(new Bird("Limon"));
		speaktry(new Dog("Karabaþ"));
		speaktry(new Horse("Þahbatur"));
		
		
	}

	 }
	
	
