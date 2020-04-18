package ru.zoloto.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.zoloto.springdi.controllers.MyController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		String message = controller.sayHello();
		System.out.println(message);
	}

}
