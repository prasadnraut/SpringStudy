package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student std1() {
		Student student = new Student();
		student.setName("Javaconfig");
		student.setRollno(201);
		student.setEmail("javaconfig@gmail.com");
		return student;
	}
	
	@Bean("std2")
	public Student secondMethod() {
		Student student = new Student();
		student.setName("Javaconfigtwo");
		student.setRollno(202);
		student.setEmail("javaconfigtwo@gmail.com");
		return student;
	}
	
}
