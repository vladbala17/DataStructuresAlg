package main.Session01;

public class W04_Strings {

    public static void reverse(char[] input) {
        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};

        reverse(s1);
        System.out.printf(String.valueOf(s1));
    }
}
