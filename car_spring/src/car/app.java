package car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		mycar bmw=context.getBean("bmw",mycar.class);
		System.out.println(bmw.brand());
		System.out.println(bmw.tyre());
		
		System.out.println();
		
		mycar audi=context.getBean("audi",mycar.class);
		System.out.println(audi.brand());
		System.out.println(audi.tyre());
		
		context.close();
	}

}
