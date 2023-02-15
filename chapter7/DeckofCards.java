package chapter7;

public class DeckofCards {
    public static void main(String[] args) {
    	int deste[]= new int[52];
    	String[] semboller= {"Maça","Kupa","Karo","Sinek"};
    	String[] sira= {"As","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    	
    	for(int i=0;i<deste.length;i++)
    	   deste[i]=i;
    	
    	for(int i=0;i<deste.length;i++) {
    		int index =(int)(Math.random()*deste.length);
    		int temp = deste[i];
             deste[i] = deste[index]; 
    		 deste[index] = temp;
    }
    	for (int i = 0; i < 4; i++) {
    		 String sembol = semboller[deste[i] / 13];
    		 String no = sira[deste[i] % 13];
    		System.out.println("Kart numarasý:"+ deste[i] +" "+ sembol+" "+ no);
	
   }
  }
}