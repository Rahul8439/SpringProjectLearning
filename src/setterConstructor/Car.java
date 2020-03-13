package setterConstructor;

public class Car {
	String carName;
	int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(String carName, int price, Engine engine) {
		super();
		this.carName = carName;
		this.price = price;
		this.engine = engine;
	}
	Engine engine;
	
	
	public Car(String carName, Engine engine) {
		super();
		this.carName = carName;
		this.engine = engine;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
