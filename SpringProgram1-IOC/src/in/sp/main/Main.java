package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Students;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//1. Spring-beans-xxx.jar
//2. Spring-core-xxx.jar
//3. Spring-context-xxx.jar
//4. commons-logging-xxx.jar
//5. Spring-expression-xxx.jar		
		
		String config = "/in/sp/resources/applicationContext.xml";
		
		//Activation of spring container in main class using XML file configuration
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		//To get object
		Students students = (Students) context.getBean("stdId");
		students.display();
		System.out.println("===============================");
		
		Students students2 = (Students) context.getBean("stdId2");
		students2.display();
	}

}
