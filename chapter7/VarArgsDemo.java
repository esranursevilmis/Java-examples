package chapter7;

public class VarArgsDemo {

	public static void main(String args[]) {
	    printMax(64, 13, 3, 2, 56);            //çeþitli parametreler gönderiliyor.
	    printMax(new double[]{1.1, 2, 3,5,7,9.1});        //bir dizi gönderiliyor.
	    printMin(2,4,5,7,9);
	    printMin(new int[] {4,5,6});    
	  }

	  public static void printMax(double...numbers) {   //çeþitli paramatreler alan metod.neden double?yukarda metod çaðýrýrken exclusive deðer double olduðu için.
	    if (numbers.length == 0) {
	      System.out.println("No argument passed");
	     
	    }

	    double result = numbers[0];

	    for (int i = 1; i < numbers.length; i++)
	      if (numbers[i] > result)
	        result = numbers[i];

	    System.out.println("The max value is " + result);
	  }
	  public static void printMin(int...numbers) {   
		  if(numbers.length==0) {
			  System.out.println("No argument passed.");
			  
		  }
		  int result=numbers[0];
		  for(int i=0;i<numbers.length;i++) {
			  if(numbers[i]<result)
				  result=numbers[i];
			 		  }
		  System.out.println("The min value is "+result);

	  }
	}
