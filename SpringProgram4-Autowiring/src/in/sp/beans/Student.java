package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private String name;
	private int rollno;
	
	//@Qualifier annotation helps us to pick right bean among the multiple beans of same type. resolving ambiguity.
	
	@Autowired
	@Qualifier("createAddressObj2")
	private Address address;
	
	@Autowired
	private Subject subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	
	public void display() {
		System.out.println("Name -"+name);
		System.out.println("Roll no -"+rollno);
		System.out.println("Address -"+address);
		System.out.println("Subjects -"+subjects);
	}
	
}
