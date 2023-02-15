package chapter7;

public class SearchSort {
	public static void main(String[] args) {
		linearSearch(new int[]{1, 4, 4, 2, 5, -3, 6, 2}, 4);
		System.out.println("Aranan eleman "+binarySearch(new int[] {2,4,5,8,10,19,24,28,30}, 30)+". indiste bulundu.");
	}

			//linear search eðer dizi kýsa ise veya kendi içinde sýrasýz ise faydalýdýr.
    public static void linearSearch(int[]list,int key) {
		  for(int i=0;i<list.length;i++) {
		   if(key==list[i]) 
		    System.out.println("Aranan eleman: "+list[i]+" dizinin "+(i+1)+". elemaný bulundu.Bulunduðu indis: "+i);
		    }
}
		    //binary search daha verimlidir uzun diziler için tabi eðer dizi önceden sýralý ise.
    public static int binarySearch(int[] list,int key) {
    int low=0;
		 int high=list.length-1;
		 while(high>=low) {
		   int mid=(low+high)/2;
		    if(key<list[mid])
		      high=mid-1;
		    else if(key==list[mid])
		      return mid;
		    else
		      low=mid+1;
		    	}
		    	return -low-1;
		    }
    public static void selectionSort(double[] list) {
	 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 }
}

