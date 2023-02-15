package chapter7;
import java.util.*;
public class AnalyzeNumbers {
    
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Dizi eleman sayisi: ");
		int n=input.nextInt();
		double[] sayilar=new double[n];
		double sum=0;
		
		System.out.print("Dizi elemanlari: ");
		for(int i=0;i<n;i++) {
		    sayilar[i]=input.nextDouble();
		    sum+=sayilar[i];  }
		
		double average=sum/n;
		
		int sayac=0;
		for(int i=0;i<n;i++) {
			if(sayilar[i]>average)
				sayac++;}
		
		System.out.println("ortalama: " + average);
		System.out.println("ortalamanýn üstünde olan sayilar: " + sayac);
		
	}

}
