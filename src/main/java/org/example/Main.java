package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

            Scanner scanner =  new Scanner(System.in);

            System.out.print("Введите температуру в градусах Цельсиях: ");

            double Цельсия = scanner.nextDouble();

            double Фаренгейт = (Цельсия* 9/5)+32;

            System.out.println(Цельсия + " в цельсиях " + Фаренгейт + " в фаренгейтах " );

            scanner.close();


        }
    }
