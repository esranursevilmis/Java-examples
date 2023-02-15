package chapter13;

import java.util.Date;

public abstract class GeometricObject {
   private String color="white";
   private boolean filled;
   private java.util.Date dateCreated;
   
   //no-arg constructor.Bunlar protected tan�mlanm��t�r.��nki sadece subclass kullan�r.
   //e�er somut bir s�n�fta nesne yarat�l�rsa o s�n�f�n constructor � �a�r�l�r.
   protected GeometricObject() {
	   dateCreated =new java.util.Date();
   }
   //color ve filled arg�manlar�yla dolu construct�r
   protected GeometricObject(String color,boolean filled) {
	   dateCreated=new java.util.Date();
	   this.color=color;
	   this.filled=filled;
   }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public java.util.Date getDateCreated() {
	return dateCreated;
}
@Override
public String toString() {
	return "yarat�ld��� tarih: "+dateCreated+"\nrengi: "+color+"ve filled"+filled;
}
//abstract metodlar
  public abstract double getArea() ;
  public abstract double getPerimeter();
  }

