package chapter11;

public class TestCircleRectangle {

	public static void main(String[] args) {
	 Circle cember = new Circle(1);
	 
	 System.out.println("Bir �emberin "+cember.toString());
	 System.out.println("rengi "+ cember.getcolor());
	 System.out.println("yar��ap� "+cember.getRadius());
	 System.out.println("alan� "+cember.getArea());
	 System.out.println("�ap� "+cember.getDiameter());
	 
	 Rectangle dikdortgen = new Rectangle(2,4);
	 
	 System.out.println("Bir dikdortgenin "+dikdortgen.toString());
	 System.out.println("alan� "+dikdortgen.getArea());
	 System.out.println("�evresi "+ dikdortgen.getPerimeter());
	 
	 
	 
	 
	 
	 
	 
	}

}
