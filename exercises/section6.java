package exercises;
import java.util.*;
public class section6 {
private static int palindrom;
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	    //6.2
		/*int x=scan.nextInt();
        System.out.println(sumDigits(x));*/
		System.out.println("****************************************");
		//6.3,6.4
		/*int a=scan.nextInt();
	    reverse(a);
	    System.out.println("girilen sayý palindrom mu? "+isPalindrome(a));*/
	System.out.println("****************************************");
/*	int x=scan.nextInt();
	int y=scan.nextInt();
	int z=scan.nextInt();
	displaySortedNumbers(x, y, z);*/
	System.out.println("****************************************");
	//int n=scan.nextInt();
	//displayPattern(n);
	System.out.println("****************************************");
	String s=scan.next();
	System.out.println(countLetters(s));
	scan.close();
	}
	public static int countLetters(String s) {
		return s.length();
		
	}
	public static void displayPattern(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
				System.out.println(k);
				k=k+(i+1)*(int)(Math.pow(10,i));
			}
		}
	public static void displaySortedNumbers(int a, int b, int c) {
		int min=a,mid=b,max=c;
		if(c>a&&c>b) {
			if(a>b) {
				mid=a;
				min=b;     
		}
}
		if(b>a&&b>c) {
			max=b;
			if(a>c) {
				mid=a;
				min=c;
			}
	}
		if(a>b&&a>c) {
			max=a;
			if(b>c) {
				mid=b;
				min=c;
			}
		}
		System.out.println(min+"<"+mid+"<"+max);
	}
	public static int sumDigits(int n) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum+=(n%10);
			n=(n/10);
	}
		return sum;
	}
	public static void reverse(int sayi) {
		palindrom=0;
		while(sayi!=0) {
			int kalan=sayi%10;
			palindrom=palindrom*10+kalan;
			sayi=sayi/10;
			}
			System.out.println(palindrom);
	}
	public static boolean isPalindrome(int n) {
		if(n==palindrom) {
			return true;
		}
		return false;
	}
}