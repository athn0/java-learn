package com.learn.java.patrones.factory.ejemplo;

import com.learn.java.patrones.factory.PizzaProducto;
import com.learn.java.patrones.factory.PizzeriaCaliforniaFactory;
import com.learn.java.patrones.factory.PizzeriaNewYorkFactory;
import com.learn.java.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        
        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());
        
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
