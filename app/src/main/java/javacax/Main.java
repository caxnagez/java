package javacax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t;
        for (int e = 0; e != -1; ) {
            System.out.println("1)fizzBuzz\n2)reverseString\n3)solveQuadraticEquation\n4)calculateSum\n5)isPalindrome\n0)exit");
            Scanner scanner = new Scanner(System.in);
            t = scanner.nextInt();
            switch (t) {
                case 1:
                    fizzBuzz();
                    break;
                case 2:
                    reverseString();
                    break;
                case 3:
                    solveQuadraticEquation();
                    break;
                case 4:
                    calculateSum();
                    break;
                case 5:
                    String str = scanner.nextLine();
                    if (isPalindrome(str)) System.out.println("is palindrome\n");
                    else System.out.println("is NOT palindrome\n");
                    break;
                case 0:
                    e = -1;
                    break;
                default:
                    break;
            }
        }
    }


    public static void fizzBuzz() {
        int n = 1, size = 499;
        for (int i = 0; i <= size; ++i) {
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (n % 5 == 0) {
                System.out.println("fizz");
            } else if (n % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(n);
            }
            n++;
        }
    }

    public static void reverseString() {
        String st = "make install";
        String str = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            str=str+String.valueOf(st.charAt(i));
        }
        System.out.println(str);
    }

    public static void solveQuadraticEquation() {
        int a, b, c;
        double y;
        System.out.println("Введите переменные a, b, c");
        y = Math.random() * 10;
        a = (int) y;
        y = Math.random() * 10;
        b = (int) y;
        y = Math.random() * 10;
        c = (int) y;
        System.out.println(a + "x+" + b + "y+" + c);
        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D=" + D);
        if (D < 0) {
            System.out.println("Нет корней");
        } else if (D == 0) {
            double x = -(b / 2.0 * a);
            System.out.println("x=" + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2.0 * a), x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            System.out.println("x1=" + x1 + "\nx2=" + x2);
        }
    }

    public static void calculateSum() {
        double sum = 0;
        int k = 2;
        while (k != -1) {
            double cur = 1.0 / (k * k + k - 2);
            sum += cur;
            if (cur < Math.pow(10, -6)) {
                k = -1;
                System.out.println(sum);
                System.out.println(cur + "<10^-6");
            } else k++;
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println("reverese: " + rev);
        if (str.equals(rev))
            return true;
         else
            return false;
        }
}