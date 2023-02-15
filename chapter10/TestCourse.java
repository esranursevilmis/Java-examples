package chapter10;

public class TestCourse {
	
		public static void main(String[] args) {
			Course ders1=new Course("NYP2");
			/*
			ders1.addStudent("Hakan");
			ders1.addStudent("Ayse");
			ders1.addStudent("Ece");
			ders1.addStudent("Ismail");
			*/
			
			ders1.addStudent(new String[]{"Hakan","Ayse","Ece","Ismail"});
			
			System.out.println("Dersi alan ogrenci sayisi "+ders1.getNumberOfStudents());
			String[] ogrenciler=ders1.getStudents();
			
			for(String h:ogrenciler) {
				if(h==null)
					break;
				System.out.println("Ogrenci: "+h);
			}
			
			ders1.dropStudent("Bora");
			
			ders1.dropStudent("Ayse");
			
			
			
			System.out.println("Dersi alan ogrenci sayisi "+ders1.getNumberOfStudents());
			ogrenciler=ders1.getStudents();
			
			for(String h:ogrenciler) {
				if(h==null)
					break;
				System.out.println("Ogrenci: "+h);
			}
			
		
	}
}

