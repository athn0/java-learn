package com.learn.java.patrones.factory;

import com.learn.java.patrones.factory.producto.PizzaNewYorkItaliana;
import com.learn.java.patrones.factory.producto.PizzaNewYorkPepperoni;
import com.learn.java.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
