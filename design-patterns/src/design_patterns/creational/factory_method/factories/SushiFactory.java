package design_patterns.creational.factory_method.factories;

import design_patterns.creational.factory_method.products.Dish;
import design_patterns.creational.factory_method.products.Sushi;

public class SushiFactory implements DishFactory {

	@Override
	public Dish createDish() {
		return new Sushi();
	}

}
