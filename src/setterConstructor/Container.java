package setterConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import start.springlearning.Class1;

public class Container {

	public static void main(String[] args) {
		// Singleton Scope-For Each request only single object is created.
		// Protoype Scope-For each required new object is created.
		ApplicationContext ap = new ClassPathXmlApplicationContext("setterConstructor/Spring.xml");
		/*
		 * using Setter 
		 * Car c=(Car) ap.getBean("car"); 
		 * Engine e=c.getEngine();
		 * System.out.println(e.modelyear);
		 */
		Car c = (Car) ap.getBean("car");
		Engine e = c.engine;
		System.out.println("Car Name "+c.carName+" Price "+c.price + " ModelYear "+e.getModelyear()+" Number of Parts "+e.numberOfParts);
	

	}

}
