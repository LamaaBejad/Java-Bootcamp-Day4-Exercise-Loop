import java.util.Scanner;

// Q1: Print 1 to 100, "Fizz" for multiples of 3, "Buzz" for multiples of 5, "FizzBuzz" for both
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);

            }
        }
        // Q2: Reverse a string
        System.out.println("input a string:  ");
        String text = input.nextLine();
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
        }
        System.out.println("Reverse string : " + reversedText);
        // Q3: Find the factorial of any number entered through the keyboard
        System.out.println("input a number:  ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Invalid number");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " = " + factorial);

            // Q4: Find one number raised to the power of another (without built-in method)
            System.out.print("Enter the base: ");
            int base = input.nextInt();
            System.out.print("Enter the power: ");
            int power = input.nextInt();
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * base;
            }
            System.out.println(base + " ^ " + power + " = " + result);

            // Q5: Read a set of integers, then print the sum of the even and odd integers
            System.out.print("How many numbers? ");
            int count = input.nextInt();
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                int n = input.nextInt();
                if (n % 2 == 0) {
                    evenSum = evenSum + n;
                } else {
                    oddSum = oddSum + n;
                }
            }
            System.out.println("Sum of even numbers = " + evenSum);
            System.out.println("Sum of odd numbers = " + oddSum);

            // Q6: Check if a positive integer is a prime number
            System.out.print("Enter a positive integer: ");
            int primeNum = input.nextInt();
            boolean isPrime = true;
            if (primeNum < 2) {
                isPrime = false;
            }
            for (int i = 2; i < primeNum; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(primeNum + " is a prime number");
            } else {
                System.out.println(primeNum + " is not a prime number");
            }

            // Q7: Print headings for 4 weeks, and days 1-7 for each week (nested for loops)
            for (int week = 1; week <= 4; week++) {
                System.out.println("Week " + week);
                for (int day = 1; day <= 7; day++) {
                    System.out.println("Day" + day);
                }
            }

            // Q8: Check if a word is a palindrome (reads the same from left to right and right to left)
            input.nextLine(); // clear the leftover Enter after nextInt()
            System.out.print("Enter a word: ");
            String palWord = input.nextLine();
            String reversedWord = "";
            for (int i = palWord.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + palWord.charAt(i);
            }
            if (palWord.equalsIgnoreCase(reversedWord)) {
                System.out.println(palWord + " is a palindrome");
            } else {
                System.out.println(palWord + " is not a palindrome");
            }

        }
    }
}
