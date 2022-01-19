package utilities;

public class MathUtility2 {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static int subtraction(int a, int b) {
        int subtract = a - b;
        return subtract;

    }

    public static double subtraction(double a, double b) {
        double subtract = a - b;
        return subtract;

    }

    public static double multiplication(double a, double b) {
        double multi = a * b;
        return multi;
    }

    public static int multiplication(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static double division(double a, double b) {
        double division = a / b;
        return division;
    }

    public static int division(int a, int b) {
        int division = a / b;
        return division;
    }

    public static boolean even(int a) {
        return (a % 2 == 0);
    }

    public static boolean odd(int a) {
        return (a % 2 != 0);
    }

    public static int maxNumber(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;

    }

    public static double maxNumber(double a, double b) {
        double max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;

    }

    public static int minNumber(int a, int b) {
        int min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;

    }

    public static double minNumber(double a, double b) {
        double min = 0;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        return min;

    }

    public static int squareOfNumber(int a) {
        int square = a * a;
        return square;
    }

    public static double squareOfNumber(double a) {
        double square = a * a;
        return square;
    }

    public static int cubeOfNumber(int a) {
        int cube = a * a * a;
        return cube;
    }

    public static double cubeOfNumber(double a) {
        double cube = a * a * a;
        return cube;
    }


}



/*
			2.1 Create a method that can return the sum of two integers

			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers

			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creat a method that can return the multiplication of two integers

			2.6 Create a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number

			2.9 Create a method that can check if an integer is odd number*//*
			---------------------------------------------------------------------------
			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double
     */