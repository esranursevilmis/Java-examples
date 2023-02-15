package chapter12;

public class TestException {
public static void main(String[] args) {
	try {
		System.out.println(sum(new int[] {1,2,3,4,5}));
	}
		catch(Exception ex) {
			ex.printStackTrace(); //hatan�n izini s�rebilid�imiz yap�
			System.out.println("\n"+ex.getMessage());
			System.out.println("\n"+ex.toString());//stackttrece in ilk sat�r�n� basar.
			
			System.out.println("\n Hatan�n izi getStackTrace den elde edildi.");
			StackTraceElement[] traceElements= ex.getStackTrace(); //hata sat�rlar�n� g�sterir.
			for (int i=0;i<traceElements.length;i++) {
				System.out.print("metod "+traceElements[i].getMethodName());
				System.out.print("("+traceElements[i].getClassName()+":");
				System.out.println(traceElements[i].getLineNumber()+")");
				
			}
	}
}
	private static int sum(int[] list) {
		int result=0;
		for(int i=0;i<=list.length;i++)
			result+=list[i];
		return result;
	}
}
