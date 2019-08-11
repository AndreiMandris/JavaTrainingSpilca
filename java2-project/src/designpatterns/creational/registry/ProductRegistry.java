package designpatterns.creational.registry;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private static enum Type {
        FOOD, BEVERAGE, SPORTS
    }

    private static Map<Type, Product> registry = new HashMap<>();

    public static Product getProduct(Type type) {
        if (!registry.containsKey(type)){
            registry.put(type, new Product());
        }
        return registry.get(type);
    }
}
