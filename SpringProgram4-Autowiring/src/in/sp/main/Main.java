package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		
	//advantages of Autowiring - 
		//1 as is Autowiring DI is automatic so programing speed will be fast and easy.
		//2 autowiring elemenates need of explicit getter and setter methods
		//3 instead if defining each bean and its dependencies explicitly in cofiguration, we can directly use annotation.
	//Dis-advantages of Autowiring -
		//1 can't achieve it on primitive data types
		
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	Student student = applicationContext.getBean(Student.class);

	student.display();

	}
}	