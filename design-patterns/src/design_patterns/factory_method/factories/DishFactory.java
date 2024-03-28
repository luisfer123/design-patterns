package design_patterns.factory_method.factories;

import design_patterns.factory_method.products.Dish;

public interface DishFactory {
	Dish createDish();
}
