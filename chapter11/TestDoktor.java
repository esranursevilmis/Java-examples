package chapter11;

public class TestDoktor {

	public static void main(String[] args) {
		
		Cerrah c1=new Cerrah();
		Doktor d1=new Doktor();
		//Doktor d=d1;
	    Doktor d2=new Cerrah();
	    Doktor d3=new Disci();
	   
	    Disci d4=(Disci)d3;//downcasting
	    System.out.println(d1 instanceof Cerrah);
	    System.out.println(c1 instanceof Cerrah);	
	    System.out.println(d2 instanceof Cerrah);
	    System.out.println(d3 instanceof Disci);
	    System.out.println(d2 instanceof Doktor);
	    
	   c1.gorev(); 
	   d1.gorev(); 
	   d2.gorev(); 
	   d3.gorev(); 
	   d4.gorev();
	}

}
