package primitiveSecondaryArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import start.springlearning.Class1;

public class Container {

	public static void main(String[] args) {
		// Singleton Scope-For Each request only single object is created.
		// Protoype Scope-For each required new object is created.
		ApplicationContext ap = new ClassPathXmlApplicationContext("primitiveSecondaryArray/Spring.xml");
		Car c = (Car) ap.getBean("car");
		String[] cars=c.getCarName();
		for(String car:cars) {
			System.out.println("Car name is "+car);
		}
	

	}

}
