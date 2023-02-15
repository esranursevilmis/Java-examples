package chapter12; 

public class TestCircleWithException {

	public static void main(String[] args) {
		try {
			CircleWithException c1= new CircleWithException(5);
            c1.getArea();
            CircleWithException c2=new CircleWithException(10);
            c2.getArea();
			CircleWithException c3= new CircleWithException(-5);
			CircleWithException c4= new CircleWithException(0);
			
		}
        catch(IllegalArgumentException ex) {
        	System.out.println(ex);
        }
		System.out.println("Yaratýlan nesne sayýsý: "+CircleWithException.getNumberOfObjects());
		
	}
	

}
