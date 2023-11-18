package collectionsPractice;


class Demo {
	private String name;
	private int age;
	//Encapsulation is binding data with methods.
	//Everytime declare variables as private because no one can access easily.
	//we can track the usage of variables by using methods. 
	
	public String getName() {
		System.out.println("name is using");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		System.out.println("age is using");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Getter_Setter_Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.setName("Kanya");
		d.setAge(23);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
		

	}

}
