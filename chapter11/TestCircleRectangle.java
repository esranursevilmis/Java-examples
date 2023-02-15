package chapter11;

public class TestCircleRectangle {

	public static void main(String[] args) {
	 Circle cember = new Circle(1);
	 
	 System.out.println("Bir çemberin "+cember.toString());
	 System.out.println("rengi "+ cember.getcolor());
	 System.out.println("yarýçapý "+cember.getRadius());
	 System.out.println("alaný "+cember.getArea());
	 System.out.println("çapý "+cember.getDiameter());
	 
	 Rectangle dikdortgen = new Rectangle(2,4);
	 
	 System.out.println("Bir dikdortgenin "+dikdortgen.toString());
	 System.out.println("alaný "+dikdortgen.getArea());
	 System.out.println("çevresi "+ dikdortgen.getPerimeter());
	 
	 
	 
	 
	 
	 
	 
	}

}
