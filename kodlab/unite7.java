package kodlab;
import java.util.*;
public class unite7 {
	//girilen iki say� aras�nda 5 in katlar�
	public static void islemYap(int x,int y){
		if(x<y) {
		for(int i=x;i<y;i++) {
			if(i%5==0)
				System.out.println(i);
	       }
	}
		else 
			System.out.println("ilk say� k���k olmal�!");
}
	
	
	public static void sekilYap(char x) {
		
	 for(int j=0;j<15;j++) {
			  System.out.print(x);
			  
 }
		  System.out.print("\nE             E");
		  System.out.println("\nE             E");
		 
     for(int j=0;j<15;j++) {
			  System.out.print(x);
			  
		  }	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		char c='E';
	    islemYap(a,b);
	    
	    System.out.println("*************************************");
	    sekilYap(c);
	    
	} 

}


