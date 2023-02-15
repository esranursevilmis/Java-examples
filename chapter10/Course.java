package chapter10;

	public class Course {
		private String courseName;
		private String[] students;
		private int numberOfStudents;
		
		public Course(String courseName) {
			this.courseName=courseName;
			students=new String[80];
		}
		
		public String getCourseName() {
			return courseName;
		}
		
		public void addStudent(String student) {
			students[numberOfStudents++]=student;
		}
		
		public void addStudent(String[] isimler) {
			for(int i=0;(isimler.length>i)&&(i<students.length-numberOfStudents);i++) 
					addStudent(isimler[i]);
		}
		
		public void dropStudent(String student) {
			int i=0;
			
			//for(i=0;i<numberOfStudents;i++)
			for(String x:students) {
				if(x!=null) {
					if(x.compareTo(student)==0)
						break;
					else
						i++;
				}
				else 
					break;
			}
			
			if(i==numberOfStudents)
				System.out.println("Sinifta boyle bir ogrenci yok!!!");
			else
			{
				for(int j=i;j<numberOfStudents;j++)
					students[j]=students[j+1];
				
				students[numberOfStudents-1]=null;
				numberOfStudents--;
			}
		}
		
		public String[] getStudents() {
			return students;
		}
		
		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		

}