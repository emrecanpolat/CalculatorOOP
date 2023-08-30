package com.company;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(10.0);
        calculator.setSecondNumber(50.5);

        System.out.println("Sayıların Toplamı: " + calculator.getAdditionResult());
        System.out.println("Sayıların Farkı: " + calculator.getSubtractionResult());
        System.out.println("Sayıların Çarpımı: " + calculator.getMultiplicationResult());
        System.out.println("Sayıların Bölümü: " + calculator.getDivisionResult());

    }



}


