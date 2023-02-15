package chapter12;

public class ArrayException {

	public static void main(String[] args) {
		int dizi[]=new int[] {12,3,11,4,90};
		try {
			System.out.println("try bloðundayýz.");
			System.out.println(dizi[6]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
			System.out.println("Hata oluþtu! dizinin 6.indisi yoktur.");
		}

	}

}
