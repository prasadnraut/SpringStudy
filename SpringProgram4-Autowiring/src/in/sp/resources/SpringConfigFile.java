package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddressObj() {
		
		Address address = new Address();
		address.setHouseno(1234);
		address.setCity("Karad");
		address.setPincode(415510);
		return address;
	}	
	
	@Bean
	public Address createAddressObj2() {
		
		Address address = new Address();
		address.setHouseno(1235);
		address.setCity("Pune");
		address.setPincode(411057);
		return address;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student student = new Student();
		student.setName("Prasad");
		student.setRollno(1);
		//student.setAddress(createAddressObj());  //Manual DI, If we use @Autowired annotation on bean property for which
												   //DI need to do, Then no need of this line
		return student;
	}
	
	@Bean
	public Subject createSubjectObj() {
		Subject subject = new Subject();
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		subject.setSubjects(list);
		//subject.setSubjects(list); //manual DI
		return subject;
				
	}

}

