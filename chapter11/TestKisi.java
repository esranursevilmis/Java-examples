package chapter11;

public class TestKisi {

	public static void main(String[] args) {
   Ogrenci og1=new Ogrenci("esra","sevilmi�","ens@gmail.com",21,"bilgisayar m.",1);
   Akademisyen a1=new Akademisyen("ergun", "gumu�", "eg@gmail.com", 45, "do�ent", "bilgisayar m.", 20);
    
System.out.println("Akademisyen Bilgisi: "+a1.toString()+" unvan�: "+a1.getUnvan()+" bolum: "+a1.getBolum()+" yayin sayisi: "+a1.getYayinSayisi());
System.out.println("��renci Bilgisi: "+og1.toString() +" bolum= "+og1.getBolum()+" sinif: "+og1.getSinif());

og1.dersEkle("NYP");
og1.dersEkle("MAT");
og1.dersEkle("EDT");
og1.dersleriGoster();

og1.dersCikar("MAT");
og1.dersleriGoster();
	
	
	
	}

}
