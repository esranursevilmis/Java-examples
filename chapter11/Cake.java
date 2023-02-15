package chapter11;
 
public class Cake {
	public void taste(Cake c) {
	System.out.println("In taste of Cake class");
   }
}

class ChocolateCake extends Cake{
	public void taste(Cake c) {
		System.out.println("In taste(Cake version) of ChocolateCake class");
	}
	public void taste(ChocolateCake cc) {
		System.out.println("In taste (ChocolateCake version) of ChocolateCake class");
	}
}

class BirthdayCake extends ChocolateCake{
	public void taste(Cake c) {
		System.out.println("In taste (Cake version) of BirthdayCake class");
	}
	public void taste (ChocolateCake cc) {
		System.out.println("In taste (ChocolateCake version) of BirthdayCake class");
	}
	public void taste(BirthdayCake bc) {
		System.out.println("In taste (BirthdayCake version) of BirthdayCake class");
	}
}