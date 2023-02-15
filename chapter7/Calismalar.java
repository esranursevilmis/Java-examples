package chapter7;
public class Calismalar {
	
	public static int[] reverse(int[] list){
		int[] result=new int [list.length];
		
		for(int i=0,j=result.length-1;i<list.length;i++,j--) {
			result[j]=list[i];
			
		}
		return result;
	}
	
	public static void swap(int n1,int n2) {
		int temp=n1;
		n1=n2;
		n2=temp;
	}
	public static void swapFirstTwoInArray(int[] array) {
		int temp=array[0];
		array[0]=array[1];
		array[1]=temp;
	}
	private static void m(int number, int[] numbers) {
		number=100;
		numbers[0]=555;
	}
	public static void main(String[] args) {
		double dizi[]=new double[5];                     //double[] dizi de olabilir.
	
/*	  for(int i=0;i<dizi.length;i++) {
		    Scanner input=new Scanner(System.in);
			System.out.print((i+1)+". eleman ne olsun: ");                    //bu kýsýmda kullanýcýnýn girdiði degerleri diziye doldurduk.
	        dizi[i]=input.nextDouble(); 
	       // dizi[i]=Math.random()*100;   rastgele sayý üreterek de diziyi doldurabiliriz.
	  }    
	  
	  
	
	  for(int i=0;i<dizi.length;i++)
		  System.out.println(i+1+". eleman "+ dizi[i]);                       //ve ekrana bastýrdýk.
	  
		double total=0;
		for(int i=0;i<dizi.length;i++)
		    total+=dizi[i];                                                   //elemanlarýn toplamýný total degiskeninde tuttuk.
		System.out.println("Elemanlar toplamý "+ total);
		
		
		double max=dizi[0];
		for(int i=1;i<dizi.length;i++) {
			if (dizi[i]>max)
				max=dizi[i];}
		System.out.println("en buyuk eleman "+ max);
		
		
		double temp =dizi[0];
		for(int i=1;i<dizi.length;i++)    {       //dizi elemanlarýný bir sola kaydýrdýk.
			dizi[i-1]=dizi[i];
		
		    dizi[i]=temp;    }            //sonda kalan indisi de bastaki temp degiskeniyle doldurduk.
			
		  for(int i=0;i<dizi.length;i++) {
			  System.out.println(i+1+". eleman "+ dizi[i]);     }  
		
		  for (int i=dizi.length-1; i>0 ;i--) {                   //!!!
		        int j = (int)(Math.random()* (i + 1));            //rastgele belirlenen indisleri karýþtýrdýk.random shuffling.
		        double tempp = dizi[i];                                
		        dizi[i] = dizi[j];                                //yer deðþtirilecek indisler deðiþtirildi.swapping.
		        dizi[j] = tempp;}
		
			
		  for(int i=0;i<dizi.length;i++) {
			  System.out.println(i+1+". eleman "+ dizi[i]);     }  */
		  
		  System.out.println("***************");
		  
		  int[] kaynakDizi= {4,15,18,30,10};
		  int[] hedefDizi= new int [kaynakDizi.length];		      //dizi elemanlarýný teker teker kopyalama
		  for(int i=0;i<kaynakDizi.length;i++) {
			  hedefDizi[i]=kaynakDizi[i];
		  }
		 // hedefDizi= java.util.Arrays.copyOf(hedefDizi, 0);
		  System.arraycopy(kaynakDizi, 0, hedefDizi, 0, kaynakDizi.length);   // baþka bir yol
		 for(int i=0;i<hedefDizi.length;i++) {
			System.out.println(hedefDizi[i]);
		}
		 /* int x=1;
		 int[] y=new int[10];
		  m(x,y);
		  
		  System.out.println("x is " + x);
		  System.out.println("y[0] is " + y[0]);   */          //output'ta x 1 kalýr ama y nin ilk elemaný 555 olur.çünkü y ve numbers baðýmsýz deðiþkenler olmasýnaraðmen 
                                                               //ayný referans(array) ý gösterirler. m çaðrýldýðýnda y hangi diziyigösterirse artýk numbers da ayný referansala
		  int a[]= {1,2};                                                                                                                //ayný diziyi gösterir.
	System.out.println("swap metodu çaðrýlmadan önce a nýn elemanlarý "+a[0]+","+a[1]);
	swap(a[0],a[1]);
	System.out.println("swap metodu çaðrýldýktan sonra a nýn elemanlarý "+a[0]+","+a[1]);
	
	System.out.println("swapFirstTwoInArray metodu çaðrýlmadan önce a nýn elemanlarý "+a[0]+","+a[1]);
	swapFirstTwoInArray(a);
	System.out.println("swapFirstTwoInArray metodu çaðrýldýktan sonra a nýn elamanlarý "+a[0]+","+a[1]);
	System.out.println("****************************");
	
	
	int[]list1= {1,2,3,4,5,6};
	int[]list2=reverse(list1);
	int[] result=new int [list1.length];

	for(int i=0;i<list2.length;i++) {
		System.out.println(list2[i]);
		
	}
	}                                                        
	
	

}
