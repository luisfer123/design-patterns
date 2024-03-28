package design_patterns.factory_method;

import design_patterns.factory_method.factories.DishFactory;
import design_patterns.factory_method.factories.PizzaFactory;
import design_patterns.factory_method.factories.SushiFactory;
import design_patterns.factory_method.products.Dish;

public class Application {
	
	public static void main(String[] args) {
		
		// Order a pizza using the PizzaFactory
		DishFactory pizzaFactory = new PizzaFactory();
		Dish pizza = pizzaFactory.createDish();
		pizza.prepare();
		pizza.serve();
		
		// Order sushi using the SushiFactory
		DishFactory sushiFactory = new SushiFactory();
		Dish sushi = sushiFactory.createDish();
		sushi.prepare();
		sushi.serve();
	}

}
