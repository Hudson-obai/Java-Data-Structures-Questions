package com.company.FizzBuzzChallenge;

import java.util.HashMap;

public class TwoSumChallenge {
    public static void main(String[] args) {
        int[]numbers = new int[]{4,5,3,25};

        int targetNumber = 29;

        int[] resultingArray = summationIndices(numbers,targetNumber);

        System.out.println(resultingArray[1]+" "+resultingArray[0]);



    }

    public static int[] summationIndices(int[] numbers, int targetNumber){

        HashMap<Integer, Integer> visitedNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int difference = targetNumber-numbers[i];

            if(visitedNumbers.containsKey(difference)){
                return new int [] {i,visitedNumbers.get(difference)};
            }
            visitedNumbers.put(numbers[i],i);
        }
        return new int[]{-1,-1};

    }
}
