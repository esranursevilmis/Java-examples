package chapter11;

public class TestCake {

	public static void main(String[] args) {
		Cake c1 = new Cake();                           //static binding komutun sol taraf�na,dynamic sa� taraf�na bakar.
		ChocolateCake cc= new ChocolateCake();
		Cake c2 = new ChocolateCake();
		Cake c3 = new BirthdayCake();
		
		
		c1.taste(cc);//dynamic binding devreye girer.taste metodu Cake de aran�r.
		cc.taste(cc);
		c2.taste(cc);//taste metodu ChocolateCkae de aran�r. 
		((BirthdayCake) c3).taste(cc);//downcasting,polymorphism kalmaz.
		((BirthdayCake) c3).taste((BirthdayCake) c3);//downcasting ,upcasting
		
		
	}

}
