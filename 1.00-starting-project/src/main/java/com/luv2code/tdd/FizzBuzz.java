package com.luv2code.tdd;

//if number is divisible by 3 , print Fizz
//if number is divisible by 5, print Buzz
//if number is divisible by 3 and 5, print FizzBuzz
//if number is NOT divisible by 3 and 5, print the number
public class FizzBuzz {

    public static String compute(int i) {

        StringBuilder result = new StringBuilder();
        if(i%3==0){
            result.append("Fizz");
        }
        if(i%5==0){
            result.append("Buzz");
        }
        if(result.isEmpty()){
            result.append(i);
        }

        return result.toString();

    }

   /*
    public static String compute(int i) {
        if(i % 15 == 0){
            return "FizzBuzz";
        }
        if(i % 3 == 0){
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(i);
        }
    }

    */
}
