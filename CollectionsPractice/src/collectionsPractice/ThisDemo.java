package collectionsPractice;

public class ThisDemo {
	int a = 200;

	public static void main(String[] args) {
		ThisDemo obj1 = new ThisDemo();
		obj1.display();
		System.out.println(Example.b);
		Example b = new Example("kanya");
		//System.out.println(b.b);
		System.out.println(b);
	}
	
	public void display() {
		int a = 10;
		System.out.println("local variable = " + a);
		System.out.println("instance variable = " + this.a);
	}

}

 class Example {
	@Override
	public String toString() {
		return "name = " + name;
	}
	static int b = 1000;
	String name;
	Example(String name1) {
		name = name1;
		//System.out.println(name1);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
