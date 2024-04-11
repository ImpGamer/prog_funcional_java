package com.imp.progFuncional.hilos.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Food{
    private boolean available;
    public boolean isAvailable() {return available;}
    public void setAvailable(boolean value){available = value;}
}
class Water{
    private boolean available;
    public boolean isAvailable() {return available;}
    public void setAvailable(boolean value){available = value;}
}
public class Fox {
    public void eatAndDrink(Food food,Water water) {
        synchronized (food) {
            System.out.println("Buena comida!");
            move();
            synchronized (water) {
                System.out.println("Agua refrescante!");
            }
        }
    }
    public void drinkAndEat(Water water,Food food) {
        synchronized (water) {
            System.out.println("Agua refrescante!");
            move();
            synchronized (food) {
                System.out.println("Buena comida!");
            }
        }
    }
    public void move() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.err.println("Error de hilos! "+e.getMessage());
        }
    }

    public static void main(String[] args) {
            Fox foxy = new Fox();
            Fox tails = new Fox();
            Food food = new Food();
            Water water = new Water();

        ExecutorService service = null;
            try {
                service = Executors.newScheduledThreadPool(10);
                service.submit(() -> foxy.eatAndDrink(food,water));
                service.submit(() -> tails.drinkAndEat(water,food));
            }finally {
                if(service != null) service.shutdown();
            }
    }
}
