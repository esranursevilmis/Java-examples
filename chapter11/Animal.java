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
	   System.out.println("Hayvan Konu�uyor.");
   }
}

class Bird extends Animal{
	 public Bird(String name) {
		 super(name);
	 }
	 @Override
	 public void speak() {
		 System.out.println(getName()+" �t�yor....");
	 }
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" Havl�yor....");
	}
}

class Horse extends Animal {
	public Horse(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" Ki�niyor....");
}	
}