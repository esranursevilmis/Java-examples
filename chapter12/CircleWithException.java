package chapter12;

public class CircleWithException {
  private double radius;
  private static int numberOfObjects=0;
  public CircleWithException() {
	  this(1.0);
  }
  public CircleWithException(double newRadius) {//her nesne yaratýldýðýnda const.çalýþýr.
	  setRadius(newRadius);                    //o yüzden her seferinde objesayýsý artýrýlýr.
	  numberOfObjects++;
  }
  public double getRadius() {
  return radius;
  }
  public void setRadius(double newRadius) throws IllegalArgumentException{
	  if(newRadius>=0)
		  radius=newRadius;
	  else
		  throw new IllegalArgumentException("Yarýçap negatif olamaz.");
		  
  }
  public static int getNumberOfObjects() {
	  return numberOfObjects;
	  
  }
  public void getArea() {
	  double area=radius*radius*3.14159;
	
	  for(int i=numberOfObjects;i<=numberOfObjects;i++) {
		  System.out.println(i+". dairenin alaný: "+area);
	  }
  }
  
}
