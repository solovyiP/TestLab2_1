package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while(true){
            System.out.println("Введите год в формате \"yyyy\" и количество дней");
            int year = scanner.nextInt();
            int days = scanner.nextInt();
            if (isLeapYear(year) && days==366){
                score++;
            }
            else if(!isLeapYear(year) && days==365){
                score++;
            }
            else {
                if(isLeapYear(year)){
                    System.out.println("Неправильно! В этом году 366 дней!");
                }
                else {
                    System.out.println("Неправильно! В этом году 365 дней!");
                }
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            return true;
        }
        else {
            return false;
        }

    }
}