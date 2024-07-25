package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Student createStudentObj() {
		
		Student student = new Student();
		student.setName("Prasad");
		student.setRollno(1);
		//student.setAddress(createAddressObj());  //Manual DI, If we use @Autowired annotation on bean property for which
												   //DI need to do, Then not need of this li
		return student;
	}

}

