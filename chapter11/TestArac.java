package chapter11;

public class TestArac {

	public static void main(String[] args) {
		/*Cocuk oduncu =new Cocuk();
		Baba baba_oduncu=new Baba();
		metodum(oduncu);
		metodum(baba_oduncu);
	}
	
	static void metodum(Object f) {
		if(f instanceof Cocuk)
			System.out.println("Gelen nesne cocuk sinifindan");
		else
			System.out.println("Gelen nesne baba sinifindan");
	}*/
		Object y=new Object();
		//System.out.println(y.toString());
		Arac z=new Araba();
		((Araba)z).teker_sayisi=4;
		
		Araba t= (Araba)z;
		//System.out.println(t.teker_sayisi);
		System.out.println(z instanceof Araba);//treu veya false döndürür.yavrusu anlamýna gelir
		System.out.println(z instanceof Arac);
		System.out.println(z instanceof Object);
		System.out.println(t instanceof Araba);
		System.out.println(t instanceof Arac);
		System.out.println(t instanceof Object);
		System.out.println(y instanceof Araba);
		System.out.println(y instanceof Arac);
		System.out.println(y instanceof Object);
		
	/*	@Override
		public boolean equals(Object obj) {
		if (obj instanceof Araba)
			return this.teker_sayisi==((Araba)obj).teker_sayisi;
		else
			return this==obj;
		}*/
		//Araba x=new Araba();
		//Araba y=new Araba();
		
		//System.out.println(x.equals(y));
		
		
	}
}
