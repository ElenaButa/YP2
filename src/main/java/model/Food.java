package model;

/*Иерархия классов
        Создай иерархию классов с продуктами, которые можно положить в корзину. Создай их в отдельном пакете model.
        В пакете должны быть:
        Класс Food — абстрактный класс с полями:
        amount — количество продукта в килограммах (целое число);
        price — цена за единицу (вещественное число);
        isVegetarian — флаг, который показывает, вегетарианский ли продукт.
        Поля должны быть доступны только из классов-потомков.


 */

public abstract class Food {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }



    /*
    public GroundTransport(boolean ground, int wheelsCount) {
    this.ground = ground;
    this.wheelsCount = wheelsCount;
    }

    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
     */

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }




}
