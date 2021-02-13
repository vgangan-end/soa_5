package com.endava.soa_5ed.problem_solving;

public class StaircaseDrawer {
    //Drawing a staircase structure - given the required height, output a staircase as shown in the example
    public static void drawStaircase(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void drawReversedStaircase(int height){
        for(int i = height; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
