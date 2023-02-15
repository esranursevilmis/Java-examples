package chapter11;

public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private int yas;
    
     
    
	public Kisi(String ad, String soyad, String email, int yas) {
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.yas = yas;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Kisi ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", yas=" + yas ;
	}
     
    
}

     class Ogrenci extends Kisi{
	     private String bolum;
	     private int sinif;
	     private int dersSayisi;
		 private String[] alinandersler;
		 
		public Ogrenci(String ad, String soyad, String email, int yas,String bolum,int sinif) {
			super(ad, soyad, email, yas);
			
			this.bolum = bolum;
			this.sinif = sinif;
			 this.alinandersler=new String[10];

}          
		public String getBolum() {
			return bolum;
		}

		public void setBolum(String bolum) {
			this.bolum = bolum;
		}
		public int getSinif() {
			return sinif;
		}
		public void setSinif(int sinif) {
			this.sinif=sinif;
		}
		public void dersleriGoster() {
			System.out.println("Öðrencinin Aldýðý Dersler: ");
			 for(int i=0;i<dersSayisi;i++) {
			     System.out.println(alinandersler[i]);}
}
		 
		 public void dersEkle(String ders) {
			 alinandersler[dersSayisi]=ders;
			 dersSayisi++;
		 }
		 
		 public void dersCikar(String ders) {
			 for(int i=0;i<dersSayisi;i++) {
				 
				 if(alinandersler[i].equals(ders)) {
					 for (int j=1;j<dersSayisi;j++) {
						 
						 alinandersler[j]=alinandersler[j+1];
						
						  }
					     dersSayisi--;
						 break;
				 }
				 
				 
				 
			 }
		 }
		 
  }
	
   class Akademisyen extends Kisi{
	private String unvan;
	private String bolum;
	private int yayinSayisi;
	public Akademisyen(String ad, String soyad, String email, int yas, String unvan, String bolum, int yayinSayisi) {
		super(ad, soyad, email, yas);
		this.unvan = unvan;
		this.bolum = bolum;
		this.yayinSayisi = yayinSayisi;
		
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	public int getYayinSayisi() {
		return yayinSayisi;
	}
	public void setYayinSayisi(int yayinSayisi) {
		this.yayinSayisi = yayinSayisi;
	}
	
	}  

