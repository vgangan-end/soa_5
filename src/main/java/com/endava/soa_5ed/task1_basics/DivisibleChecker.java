package com.endava.soa_5ed.task1_basics;

public class DivisibleChecker {
    //    Write a method that prints if a number is divisible by 3 or 5. Use if else statement.

    public void checkDivisible(int number){
        if(number%5==0 && number%3==0){
            System.out.println(number + " is divisible by 3 and 5");
        }else if(number%5 ==0){
            System.out.println(number + " is divisible by 5");
        }else if(number%3==0){
            System.out.println(number + " is divisible by 3");
        }else
            System.out.println(number + " isn't divisible by 3 nor 5");
    }
}
