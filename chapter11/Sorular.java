package chapter11;

public class Sorular {

	
	/*	public static void printArray(Object[] list) {
		for(Object o: list) {
			System.out.println(o +"");
			System.out.println();
			
		}
}
	public static void main(String[] args) {
		Integer[] list1= {12,24,55,1};
		Double[] list2= {12.4,24.0,55.2,1.0};
		int[] list3= {1,2,3};
		printArray(list1);
		printArray(list2);
		//printArray(list3); list3 int(primitive tip olduðundan warapper class olmadýðýndan 
		//derleme hatasý verir.
		
	}*/
	/*public static void main(String[] args) {
		  A a = new A(2);
		  }
}
		  class A extends B {
		  public A(int t) { 
		  System.out.println("A's constructor is invoked");
		 }
		 }
		 Burda önce ata sýnýfýn constructorý çaðrýldý.sonra yavru sýnýf
		 class B {
		 public B() {
		 System.out.println("B's constructor is invoked");}
}*/

	public static void main(String[] args) {
		new A();
		new B();
		new C();
		 }
	}
		
		class A {
		int i = 7;
		public A() {
		 setI(20);
		 System.out.println("i from A is " + i);
		 }
		public void setI(int i) {
		this.i = 2 * i;
		 }
		}
		class B extends A {
		public B() {
		 System.out.println("i from B is " + i);
		 }
		@Override
		public void setI(int i) {
		this.i = 3*i;
		}
		
		}
		class C extends B {
			public C() {
				System.out.println("i from C is "+ i);
			}
		@Override
		public void setI(int i) {
			this.i= 4*i;
		}
	}

		
		
		
		





















