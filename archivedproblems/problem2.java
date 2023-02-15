package archivedproblems;
//FIBONACCI DÝZÝSÝNDEKÝ ÇÝFT SAYILARIN TOPLAMI
public class problem2 {

	public static void main(String[] args) {
		int i=0;
		int sum=2;
	int dizi[]=new int[32];
	  dizi[0]=1;
	  dizi[1]=2;
	  for(i=2;i<dizi.length;i++) {
		  dizi[i]=dizi[i-1]+dizi[i-2];
		  
		
	   if(dizi[i]%2==0)
		sum+=dizi[i];
	
	}
	 
	  System.out.println(sum);
	}
}
