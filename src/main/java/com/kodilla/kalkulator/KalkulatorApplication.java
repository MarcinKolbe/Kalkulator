package com.kodilla.kalkulator;

public class KalkulatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,2);
        int sum = calculator.add();
        System.out.println("Wynik dodawania: " + sum);
        int subtract = calculator.subtract();
        System.out.println("Wynik odejmowania: " + subtract);
        }

}
