package chapter11;

public class Doktor {
	public void gorev() {
		System.out.println("Doktorlar hastalarý tedavi eder.");
	}
}
class Cerrah extends Doktor{
	@Override
	public void gorev() {
		System.out.println("Cerrahlar hastalarý ameliyat eder.");
	}
}

class Disci extends Doktor{
	@Override
	public void gorev() {
		System.out.println("Diþçiler hastalarýn diþlerini yapar.");
	}
}