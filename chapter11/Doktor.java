package chapter11;

public class Doktor {
	public void gorev() {
		System.out.println("Doktorlar hastalar� tedavi eder.");
	}
}
class Cerrah extends Doktor{
	@Override
	public void gorev() {
		System.out.println("Cerrahlar hastalar� ameliyat eder.");
	}
}

class Disci extends Doktor{
	@Override
	public void gorev() {
		System.out.println("Di��iler hastalar�n di�lerini yapar.");
	}
}