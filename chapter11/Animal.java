package chapter11;

public class Animal {
   private String name;
   public Animal(String name) {
	   this.name=name;
   }
 
   public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void speak() {
	   System.out.println("Hayvan Konuþuyor.");
   }
}

class Bird extends Animal{
	 public Bird(String name) {
		 super(name);
	 }
	 @Override
	 public void speak() {
		 System.out.println(getName()+" Ötüyor....");
	 }
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" Havlýyor....");
	}
}

class Horse extends Animal {
	public Horse(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" Kiþniyor....");
}	
}