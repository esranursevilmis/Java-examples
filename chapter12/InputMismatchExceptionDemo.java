package chapter12;
import java.util.*;
public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		boolean continueInput=true;
		
		do {
			try {
				System.out.println("Bir tam sayý girin: ");
				int number=input.nextInt();
				
				System.out.println("Girilen sayý: "+ number);
				 continueInput=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Tekrar deneyiniz.(Tam sayý isteniyor.)");
				input.nextLine();
				
			}
		}
			while((continueInput));
		
	}

}

		