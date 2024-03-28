package design_patterns.creational.factory_method.products;

public class Sushi implements Dish {

	@Override
	public void prepare() {
		System.out.println("Preparing sushi...");
	}

	@Override
	public void serve() {
		System.out.println("Serving sushi...");
	}

}
