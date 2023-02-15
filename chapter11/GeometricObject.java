package chapter11;

public class GeometricObject {
     private String color="beyaz";
     private boolean filled;
     private java.util.Date dateCreated;
     
     
     public GeometricObject() {
    	 dateCreated=new java.util.Date();
     }
     public GeometricObject(String color,boolean filled) {
    	 dateCreated=new java.util.Date();
    	 this.color=color;
    	 this.filled=filled;
    }
     public String getcolor() {
    	 return color;
     }
     public void setcolor(String color){
    	 this.color=color;
     }
     public boolean isFilled() {
    	 return filled;
     }
     public void setFilled(boolean filled) {
    	 this.filled=filled;

     }
     public java.util.Date getDateCreated(){
    	 return dateCreated;
     }
     public String toString() {
    	return "yaratýldýðý zaman" + dateCreated +"\renk:" + color+
    			"and filled"+ filled;
     
     
}
}     





























