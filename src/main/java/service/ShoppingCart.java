package service;

import model.Food;

public class ShoppingCart {

    Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;

    }

    public double sumWithoutDisount() {
        System.out.println("sumWithoutDisount");
        double sumWithoutDisount = 0;

        for (int i = 0; i <= foods.length; i++) {
            sumWithoutDisount = sumWithoutDisount + (foods[i].getPrice()) * (foods[i].getAmount());
        }
        //double sumWithoutDisount =
        return sumWithoutDisount;// сумму покупки;
    }

    public double sumWithDisount() {
        System.out.println("sumWithDisount");
        return 0;// сумму покупки;
    }

    public double sumVegWithotDisount() {
        System.out.println(" sumVegWithotDisount");
        double sum = 0;

        /*
        for (int i = 0; i <= 3; i++) {
            if ((foods[i].getName().equals(isVegetarian. true)){
                sum = sum + foods[i].price;
            }
            sum = sum + foods[i].price;
        }

         */
        return sum; // сумму покупки;

    }
}
