package com.zipcodewilmington;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String input : array) {
            if (input == value) {
                return true;
            }
        }

        return false;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String reverseArray = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = reverseArray;
        }

        return array;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i <= array.length / 2 && array.length != 0; i++) {
            if (array[i] != array[array.length - i - 1]) {
                break;
            }
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentence = String.join("", array).toLowerCase();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < 26; i++) {
            if (sentence.contains(alphabet[i])) {
            } else {
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayMinusValue = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                arrayMinusValue.add(array[i]);
            }
        }
        return arrayMinusValue.toArray(new String[arrayMinusValue.size()]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> excludingRepeats = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (array.length -1 == i) {
                excludingRepeats.add(array[i]);
            }
            else if (!array[i].equals(array[i +1])) {
                excludingRepeats.add(array[i]);
            }
        }
        return excludingRepeats.toArray(new String[excludingRepeats.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayPacked = new ArrayList<String>();
        arrayPacked.add(array[0]);
        int j = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(Character.toString(arrayPacked.get(j).charAt(0)))) {
                String concat = arrayPacked.get(j) + array[i];
                arrayPacked.set(j, concat);
            } else {
                arrayPacked.add(array[i]);
                j++;
            }
        }
        return arrayPacked.toArray(new String[arrayPacked.size()]);
    }
}




