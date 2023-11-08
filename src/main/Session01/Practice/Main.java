package main.Session01.Practice;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.printf("result is" + isAnagram("rat","car"));

    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] == nums[index + 1]) {
                return true;
            }
            index++;
        }
        return false;
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (i < j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isAnagram(String s, String t) {
        StringBuilder left = new StringBuilder(s);
        StringBuilder right = new StringBuilder(t);

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < right.length(); i++) {
            int foundCharIndex = left.indexOf(String.valueOf(right.charAt(i)));
            if (foundCharIndex >= 0) {
                right.deleteCharAt(foundCharIndex);
            } else {
                return false;
            }
        }
        return true;
    }
}