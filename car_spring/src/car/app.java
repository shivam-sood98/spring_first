package car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		mycar brand=context.getBean("bmw",mycar.class);
		System.out.println(brand.brand());
		
		context.close();
	}

}
