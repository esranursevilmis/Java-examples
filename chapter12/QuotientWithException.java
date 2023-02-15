package chapter12;
import java.util.*;
public class QuotientWithException {
  public static int quotient(int number1,int number2) {
	  if(number2==0)
		  throw new ArithmeticException("Payda 0 olamaz!");
	  return number1/number2;
  }
  public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Ýki tane tam sayý girin: ");
	int number1=input.nextInt();
	int number2=input.nextInt();
	
	
	try {
		int result=quotient(number1,number2);
		System.out.println(number1+"/"+number2+" is "+result);
	}
	catch(ArithmeticException ex) {
		System.out.println("Hata:Bir tamsayý 0 ile bölünemez.");
	}
	System.out.println("Execution devam ediyor...");
}
  
}
