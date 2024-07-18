package in.sp.beans;

public class Student {

	
	private int rollno;
	private String name;
	private Address address;
	
	public Student(int rolln, String name, Address address) {
		
		this.rollno=rolln;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println("roll no "+rollno);
		System.out.println("name "+name);
		System.out.println("address "+address);
	}
}
