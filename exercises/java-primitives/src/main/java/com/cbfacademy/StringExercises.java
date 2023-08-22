package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String result = new String (characters);
        return result;
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        long chartecterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                chartecterCount++;
            }
        }
        return chartecterCount;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        int letterStart = 0;
        int letterEnd = word.length() - 1;
        while (letterStart < letterEnd) {
            if (word.charAt(letterStart) != word.charAt(letterEnd)) {
                return false;
            }
            letterStart++;
            letterEnd--;
        }
        return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
