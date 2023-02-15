package chapter10;

public class LabDersi {
     public static void main(String[]args) {
    	 String metin=new String("Bursa Teknik Üniversitesi");
    	 String metin1="Ýstanbul Teknik Üniversitesi";
    	 String metin2="Ýstanbul Teknik Üniversitesi";
    	 String metin3=new String("Bursa Teknik Üniversitesi");
    	 String metin4=new String("iSTANBUL Teknik Üniversitesi");
    	 
    	 System.out.println(metin.equals(metin2));
    	 System.out.println(metin1.equals(metin2));
    	 System.out.println(metin.equals(metin3));              //equals metodu nesneleri deðil deðerleri karþýlaþtýrýr.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin==metin2);
    	 System.out.println(metin1==metin2);
    	 System.out.println(metin==metin3);                    //== operatorü nesneleri karþýlaþtýrýr.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.compareTo(metin2));
    	 System.out.println(metin1.compareTo(metin2));
    	 System.out.println(metin.compareTo(metin3));             //compereTo ASCII kodlarýna göre karþýlaþtýrma yapar.geri dönüþ tipi int tir.
    	 System.out.println(metin2.compareTo(metin4)); 
    	 System.out.println(metin2.compareToIgnoreCase(metin4));  //bu satýrdaki iþlem büyük küçük harf farklýlýðýný dikkate almaz.
    	  
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.concat(metin2));
    	 System.out.println(metin1.concat(metin2));
    	 System.out.println(metin +metin3);                 //concat metodu iki stringi birleþtirir.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.substring(6));
    	 System.out.println(metin1.substring(9));
    	 System.out.println(metin.substring(6,12));       //stringin istediðimiz kýsmýný almamýzý saðlar.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.toUpperCase());                 //butun stringi buyukharfe cevirir.
    	 System.out.println(metin.toLowerCase());                 //butun stringi kucukharfe cevirir.
    	 
    	 System.out.println(metin.charAt(7));                    //charat metodu indise göre o karakteri döndürür.   
    	 System.out.println(metin1.charAt(9));
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.replace("Bursa","Ýstanbul"));  // stringin belli kýsýmlarýný yer deðiþtiririz.ilk parametre deðiþtirilen ikincisi deðiþtirdiðimiz stirng
    	 System.out.println(metin.replace("Bursa","Gebze")); 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
