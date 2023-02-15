package kodlab;

public class unite6 {

	public static void main(String[] args) {
	//faktoriyel
		int a =5;
		int fakt=1;
		for(int i=1;i<=a;i++) {
			fakt*=i;
		}
		System.out.println("5 in faktoriyeli: "+fakt);
		
		System.out.println("*****************");
		//20 ile 90 arasýndaki asal sayýlar
     for(int k=20;k<=90;k++) {
    	 int kontrol=0;
    	 for(int i=2;i<k;i++) {
    		 if(k%i==0) {
    			 kontrol=1;
    			 break;
    		 }
  }
    	 if(kontrol==0)
    		 System.out.println(k);
}   
     System.out.println("*****************");
     //* ile þekil oluþturma
int sembol=9;
int m,n;
for(m=1;m<9;m++) {
	for(n=1;n<sembol;n++) {
		System.out.print("*");
	}
	System.out.println("");
	sembol--;
}
     
     
     
     
     
     
     
     
		
	}
}