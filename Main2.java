package Lesson2;
//Задача 2 Реализовать в коде в виде объекта обычную шариковую ручку.
//Создайте класс Solid (стержень) с полями: цвет чернил и количество чернил в процентах.
//Например, есть стержень наполовину пуст, значит количество чернил равно 50%.
//Создайте класc Pen(ручка) с полем: стержень (переменная типа Solid).
//
//Все поля сделайте private.
//Создайте необходимые конструкторы, сеттеры и геттеры.
//
//В классе Pen создайте метод
//void write(String text) - выводит на консоль сообщение text с пометкой цвета.
//Например: write("hello") выведет: hello (black)
//Каждый вызов метода write уменьшает количество черник на случайное кол-во процентов в диапазоне от 10 до 20.
//Например, было 100% чернил, вывели одну фразу, стало 85%.
//Если чернила кончились, метод должен вывести: недостаточно чернил
//
//В мейне создайте объект класса Pen черного цвета.
//С помощью метода write израсходуйте все чернила (с помощью цикла).
//Далее юзер вводит с консоли новый цвет и вам нужно вставить в объект класса Pen новый объект класса Solid для замены стрежня с введенным с консоли цветом.
//
//Например:
//hello world (blue)
//hello world (blue)
//hello world (blue)
//hello world (blue)
//hello world (blue)
//Недостаточно чернил
//Выберите новый цвет для замены стрежня: red
//red
//red
//red
//red
//red

import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

Pen pen = new Pen(new Solid("black", 100));
        Random ink = new Random();
        Solid.inkPercent= ink.nextInt(20)+10;

pen.write("I write ");

    }
}
class Pen{
    private Solid solid;
    Pen(Solid solid){
        this.solid=solid;
    }

    public Solid getSolid() {
        return solid;
    }

    public void setSolid(Solid solid) {
        this.solid = solid;
    }


    void write(String text){
        for (int i = 0; i < ; i++) {
            System.out.println(text + solid.getColor());
        }




    }
}

        class Solid{


            private String color;
    private  int inkPercent;

    Solid(String color, int inkPercent){
        this.color=color;
        this.inkPercent=inkPercent;

    }


            public  String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public int getInkPercent() {
                return inkPercent;
            }

            public void setInkPercent(int inkPercent) {
                this.inkPercent = inkPercent;
            }
        }