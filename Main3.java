package Lesson2;
//Задача 3 В задаче представлены только базовые требования. Можно дописывать свой код.
//Создать класс Card со значением
//масть карты (виды масти: Черви, Пики)
//значение карты (целое число от 1 до 5 включительно)
//Создайте класс Deck (колода) с массивом на 10 элементов типа Card.
//В данной задаче будем считать, что колода состоит из 10-и карт, где каждая карта имеет две масти.
//Карты из колодцы:
//Ч 1, П1 (черви 1, пики 1)
//Ч 2, П 2
//Ч 3, П 3
//Ч 4, П 4
//Ч 5, П 5
//
//В мейне создайте консольное меню:
//1. Добавить карту (юзер вводит с консоли масть и значение)
//2. Выход
//
//Задача юзера  - собрать колоду из карт. При выборе первого пункта юзер вводит масть добавляемой карты и ее значение. Программа должна сначала проверить, что такой карты еще нет в колоде и только потом добавить ее.
//Когда юзер соберет все карты, программа должна вывести на консоль "Колода собрана!" И вывести все карты


//Задача 4 Усложнение задачи Card.
//Генерируйте значения и масти реальных карт.
//Возможные значния: 6 7 8 9 10 J Q K A
//Возможные масти: черви, пики, крести, буби (или по английски можно)

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int input = 0;
        while(input!=2){
            System.out.println("1. Добавить карту\n" +
                    "2. Выход");
            input = scn.nextInt();
            if(input == 1){


                }
            }
            if(input == 2){
                System.out.println("Выход");

            }
        }
    }

class Deck{
    Card [] card = new Card[32];
}
class  Card{

    int [] cardNum = {6,7,8,9,10};
    String[] cardName = {"Diamonds", "Hearts", "Clubs", "Spades"};
    String[] cardFace = {"Jack", "Queen", "King", "Ace"};

}