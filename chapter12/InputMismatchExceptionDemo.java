package chapter12;
import java.util.*;
public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		boolean continueInput=true;
		
		do {
			try {
				System.out.println("Bir tam say� girin: ");
				int number=input.nextInt();
				
				System.out.println("Girilen say�: "+ number);
				 continueInput=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Tekrar deneyiniz.(Tam say� isteniyor.)");
				input.nextLine();
				
			}
		}
			while((continueInput));
		
	}

}

		