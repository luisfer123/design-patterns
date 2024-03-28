package design_patterns.creational.factory_method.factories;

import design_patterns.creational.factory_method.products.Dish;
import design_patterns.creational.factory_method.products.Pizza;

public class PizzaFactory implements DishFactory {

	@Override
	public Dish createDish() {
		return new Pizza();
	}

}
