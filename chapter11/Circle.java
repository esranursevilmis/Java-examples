package chapter11;

 public class Circle extends GeometricObject{
    private double radius;
    
    public Circle() {
    	
    }
    public Circle(double radius) {
    	this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled) {
    	super(color,filled);
    	this.radius=radius;
    //	setcolor(color);
    //	setFilled(filled);
    	
    }
    public double getRadius() {
    	return radius;
    }
    public void setRadius(double radius) {
    	this.radius=radius;
    }
    public double getArea() {
    	return radius*radius*Math.PI;
    }
    public double Perimeter() {
    	return 2*radius*Math.PI;
    }
    public double getDiameter() {
    	return 2*radius;
    }
    @Override
    public String toString() {
    	return super.toString() + "\nradius is " + radius;
   /* public void printCircle() {
    	System.out.println("Bu çemberin yaratýldýðý zaman:" + super.getDateCreated()
    	+" ve yarýçap:" + radius);*/
    }
    
    
    
}
