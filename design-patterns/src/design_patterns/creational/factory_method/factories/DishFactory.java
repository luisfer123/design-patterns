package design_patterns.creational.factory_method.factories;

import design_patterns.creational.factory_method.products.Dish;

public interface DishFactory {
	Dish createDish();
}
