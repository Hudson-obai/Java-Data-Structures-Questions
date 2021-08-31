package com.company.ReverseAString;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("nosduH")); ; ;
    }

    static String reverseString(String stringToBeReversed){
//      Convert the string into an array of characters.
        String reversedString = "";
        char[] arrayOfCharacters = stringToBeReversed.toCharArray();

            for (int j = arrayOfCharacters.length-1; j >=0; j--) {
                reversedString+=arrayOfCharacters[j];
            }
return reversedString;








    }
}
