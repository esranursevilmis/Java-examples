package chapter10;

public class Loan {
  
	private double yillikFaizOrani;
	private int seneSayisi;
	private double borcMiktari;
	private java.util.Date borcTarihi;
	
	//DEFAULT CONSTRUCTOR
	public Loan() {
		this(2.5,1,1000);
		}
	
	//PARAMETRELÝ CONSTRUCTOR
	public Loan(double yillikFaizOrani, int seneSayisi, double borcMiktari) {
 
	this.yillikFaizOrani=yillikFaizOrani;
	this.seneSayisi=seneSayisi;
	this.borcMiktari=borcMiktari;
	borcTarihi=new java.util.Date();	
	}

	public double getYillikFaizOrani() {
		return yillikFaizOrani;
	}

	public void setYillikFaizOrani(double yillikFaizOrani) {
		this.yillikFaizOrani = yillikFaizOrani;
	}

	public int getSeneSayisi() {
		return seneSayisi;
	}

	public void setSeneSayisi(int seneSayisi) {
		this.seneSayisi = seneSayisi;
	}

	public double getBorcMiktari() {
		return borcMiktari;
	}

	public void setBorcMiktari(double borcMiktari) {
		this.borcMiktari = borcMiktari;
	}

	public double getAylikOdeme() {
		double aylikFaizOrani=yillikFaizOrani/1200;
		double aylikOdeme=borcMiktari*aylikFaizOrani/(1-(1/Math.pow(1+aylikFaizOrani,seneSayisi*12 )));
	return aylikOdeme;
	}
	public double getToplamOdeme() {
	double toplamOdeme= getAylikOdeme()*seneSayisi*12;
	    return toplamOdeme;
	}
	
	
	public java.util.Date getBorcTarihi() {
		return borcTarihi;
	}

}    


