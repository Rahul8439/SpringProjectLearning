package setterConstructor;

public class Engine {
	String modelyear;
	int numberOfParts;

	public String getModelyear() {
		return modelyear;
	}

	public Engine(String modelyear, int numberOfParts) {
		super();
		this.modelyear = modelyear;
		this.numberOfParts = numberOfParts;
	}

	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
}
