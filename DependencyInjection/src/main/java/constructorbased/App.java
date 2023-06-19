package constructorbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("constructorbased/config.xml");
		Book b1 = (Book) con.getBean("b1");
		System.out.println(b1);
	}
}
