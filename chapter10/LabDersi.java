package chapter10;

public class LabDersi {
     public static void main(String[]args) {
    	 String metin=new String("Bursa Teknik �niversitesi");
    	 String metin1="�stanbul Teknik �niversitesi";
    	 String metin2="�stanbul Teknik �niversitesi";
    	 String metin3=new String("Bursa Teknik �niversitesi");
    	 String metin4=new String("iSTANBUL Teknik �niversitesi");
    	 
    	 System.out.println(metin.equals(metin2));
    	 System.out.println(metin1.equals(metin2));
    	 System.out.println(metin.equals(metin3));              //equals metodu nesneleri de�il de�erleri kar��la�t�r�r.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin==metin2);
    	 System.out.println(metin1==metin2);
    	 System.out.println(metin==metin3);                    //== operator� nesneleri kar��la�t�r�r.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.compareTo(metin2));
    	 System.out.println(metin1.compareTo(metin2));
    	 System.out.println(metin.compareTo(metin3));             //compereTo ASCII kodlar�na g�re kar��la�t�rma yapar.geri d�n�� tipi int tir.
    	 System.out.println(metin2.compareTo(metin4)); 
    	 System.out.println(metin2.compareToIgnoreCase(metin4));  //bu sat�rdaki i�lem b�y�k k���k harf farkl�l���n� dikkate almaz.
    	  
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.concat(metin2));
    	 System.out.println(metin1.concat(metin2));
    	 System.out.println(metin +metin3);                 //concat metodu iki stringi birle�tirir.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.substring(6));
    	 System.out.println(metin1.substring(9));
    	 System.out.println(metin.substring(6,12));       //stringin istedi�imiz k�sm�n� almam�z� sa�lar.
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.toUpperCase());                 //butun stringi buyukharfe cevirir.
    	 System.out.println(metin.toLowerCase());                 //butun stringi kucukharfe cevirir.
    	 
    	 System.out.println(metin.charAt(7));                    //charat metodu indise g�re o karakteri d�nd�r�r.   
    	 System.out.println(metin1.charAt(9));
    	 
    	 System.out.println("*********************");
    	 
    	 System.out.println(metin.replace("Bursa","�stanbul"));  // stringin belli k�s�mlar�n� yer de�i�tiririz.ilk parametre de�i�tirilen ikincisi de�i�tirdi�imiz stirng
    	 System.out.println(metin.replace("Bursa","Gebze")); 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
