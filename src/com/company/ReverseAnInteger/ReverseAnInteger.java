package com.company.ReverseAnInteger;

public class ReverseAnInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(6520007));;

    }

    //Assuming we have a number like 74556 and we need to reverse it to be 65547. We need to find a way to grab the last number
    //make it the first number.

    static long reverseInteger(int input){
//initialize reversed number to 0;
        long reversed = 0;

        while(input != 0){

            reversed = reversed *10 + input%10;
            input /=10;
        }

        return reversed;

    }
}
