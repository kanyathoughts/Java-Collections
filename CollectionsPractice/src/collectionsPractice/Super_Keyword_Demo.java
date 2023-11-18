package collectionsPractice;

public class Super_Keyword_Demo {

	public static void main(String[] args) {
		B obj1 = new B();
		System.out.println(obj1.a);
		obj1.display();
		
		

	}
	
	

}

class A {
	int a = 20;
	void display() {
		System.out.println("Parent");
	}
	
	A() {
		System.out.println("parent constructor");
	}
}

class B extends A{
	int a = 40;
	B() {
		System.out.println("child constructor");
	}
	void display() {
		System.out.println("child");
		System.out.println(super.a);
		super.display();
	}
	
}
