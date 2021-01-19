package com.endava.soa_5.basic;

public class HomeWork {

    public static void main(String[] args) {

        LegalTimeConverter legalTimeConverter = new LegalTimeConverter(5000);
        System.out.println(legalTimeConverter.messageForResult());

        Number number = new Number(8);
        System.out.println(number.setNumberForResult());

        NameOfTheDay nameOfTheDay = new NameOfTheDay(9);
        System.out.println(nameOfTheDay.setDayForResult());

        DifferentTypeOfSumCalculation differentTypeOfSumCalculation = new DifferentTypeOfSumCalculation(7);
        System.out.println(differentTypeOfSumCalculation.sumForLoopResult());

        DifferentTypeOfSumCalculation differentTypeOfSumCalculation_1 = new DifferentTypeOfSumCalculation(8);
        System.out.println(differentTypeOfSumCalculation_1.sumWhileResult());

        DifferentTypeOfSumCalculation differentTypeOfSumCalculation_2 = new DifferentTypeOfSumCalculation(9);
        System.out.println(differentTypeOfSumCalculation_2.sumDoWhileResult());

    }
}
