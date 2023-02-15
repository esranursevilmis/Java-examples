package chapter11;

public class Arac {
   int kapasite;
   boolean calisiyor;
   
   Arac(){
	   calisiyor=true;
   }
   Arac(int y){
	   calisiyor=true;
	   kapasite=y;
   }
   void hareketet() {    // aþaðýdaki metod ile override edildi.
	   System.out.println("hareket basladi.");
   }
}
   class Araba extends Arac{
	int teker_sayisi;
	Araba(){
		super(8);
		this.teker_sayisi=4;
	    //super.kapasite=8;
		//kapasite=8;
	}
	Araba(int teker_sayisi){
		this.teker_sayisi=teker_sayisi;
	}
	public void hareketet() {
		System.out.println("VINNN"); // bu metod private olsaydý overloading olurdu.
	}
	@Override
	public boolean equals(Object obj) {
		return this.teker_sayisi==((Araba)obj).teker_sayisi;
	}
  }	
	
	class Baba extends Object{
		void odunKes() {
			System.out.println("Balta");
		}
	}
	
	class Cocuk extends Baba{
		void odunKes() {
			System.out.println("Testere");
	}
		void atadan_kalma_yontem() {
			super.odunKes();
		}
}
	
