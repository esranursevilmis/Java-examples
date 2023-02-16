package archivedproblems;
//1000 'IN ALTINDAKI 3 VEYA 5 IN TÜM KATLARININ TOPLAMINI BULUN.
public class problem1 {

	public static void main(String[] args) {
		int sum=0;
		
		/*for(int i=1;i<1000;i++) {
			if (i%3==0) {
			sum1+=i;
			}
		}
		for(int j=1;j<1000;j++) {
			if(j%5==0&&j%3!=0)
				sum2+=j;
			
		}*/
		//KISA YOL
		 for(int i=0;i<1000;i++) {
		      if(i%3==0||i%5==0)
		      sum+=i;}
		
		//sum=sum1+sum2;
		//System.out.println("3 ün katlarýnýn toplamý: "+sum1+"\n5 in katlarýnýn toplamý:  "+sum2+"\n3 ve 5 in katlarýnýn toplamý: "+sum);
		 System.out.println(sum);
	}		
				
				
		
	}


