package chapter11;

public class TestKisi {

	public static void main(String[] args) {
   Ogrenci og1=new Ogrenci("esra","sevilmiþ","ens@gmail.com",21,"bilgisayar m.",1);
   Akademisyen a1=new Akademisyen("ergun", "gumuþ", "eg@gmail.com", 45, "doçent", "bilgisayar m.", 20);
    
System.out.println("Akademisyen Bilgisi: "+a1.toString()+" unvaný: "+a1.getUnvan()+" bolum: "+a1.getBolum()+" yayin sayisi: "+a1.getYayinSayisi());
System.out.println("Öðrenci Bilgisi: "+og1.toString() +" bolum= "+og1.getBolum()+" sinif: "+og1.getSinif());

og1.dersEkle("NYP");
og1.dersEkle("MAT");
og1.dersEkle("EDT");
og1.dersleriGoster();

og1.dersCikar("MAT");
og1.dersleriGoster();
	
	
	
	}

}
