package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // String weather = "Raining";
     String weather = "Sunny";

        //we are checking it Raining or not.
        if (weather.equals("Raining")) {
            System.out.println("I am carrying an Umbrella With me.");
        }else {
            System.out.println("I don't need an Umbrella");
        }
                //1 to 5
        //3 is good
        //4 is very good
        //5 is excellent

        int grade = 2;

        if (grade == 3){
            System.out.println("Good");

        }else if (grade == 4){
            System.out.println("Very Good");
        }else if (grade == 5){
            System.out.println("Excellent");
        }else {
            System.out.println("fail");
        }

    }
}
