package Session01;

public class W01_FizzBuzz {

    public static void showFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        showFizzBuzz(100);
    }
}
