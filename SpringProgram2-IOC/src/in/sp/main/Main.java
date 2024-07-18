package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Activation of spring container in main class using Java file configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		//To get object
		Student student = (Student) context.getBean("std1");
		student.display();
		System.out.println("===============================");
		Student student2 = (Student) context.getBean("std2");
		student2.display();
	}

}
