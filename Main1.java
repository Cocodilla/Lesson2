package Lesson2;
//Задача 1 Создать класс Pistol на один патрон.
//Патрон реализуйте в виде класса Bullet с полями: вес и скорость полета
//В классе Pistol создать поле в типе данных Bullet.
//
//Все поля делайте private.
//Создайте необходимые конструкторы, геттеры и сеттеры.
//
//В классе Pistol реализуйте метод
//int shot() - возвращает урон от пули, расчитывается по формуле: скорость пули на вес пули.
//
//В мейне создайте объект класса Pistol, добавьте ему объект bullet с весом 10 и скоростью 1000.
//Создайте меню:
//1. Узнать урон пули
//2. Изменить скорость пули
//3. Изменить вес пули
//4. Выход


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Pistol pistol = new Pistol(new Bullet(1000,10));
        System.out.print("1. Узнать урон пули\n" +
                "2. Изменить скорость пули\n" +
                "3. Изменить вес пули\n" +
                "4. Выход ");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        if (input==1) {
            System.out.println(pistol.inshot());
        }
        else if (input==2) {
            System.out.println("Введите новую скорость пули");
            int speed = scn.nextInt();
            pistol.getBullet().setSpeed(speed);
        }
        else if (input==3) {
            System.out.println("Введите новый вес пули");
            int weight = scn.nextInt();
            pistol.getBullet().setWeight(weight);
        }
        else if (input==4) {
            System.out.println("Выход из программы");
        }
    }
}
class Pistol {

    private Bullet bullet;

    Pistol(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
    public int inshot(){
        return bullet.getSpeed()*bullet.getWeight();
    }

}
class Bullet{

    private int speed;
    private int weight;

    Bullet(int speed, int weight) {
        this.speed = speed;
        this.weight=weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}