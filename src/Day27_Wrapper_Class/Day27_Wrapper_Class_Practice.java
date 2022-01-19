package Day27_Wrapper_Class;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class Day27_Wrapper_Class_Practice {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);

        double dobMax = Double.MAX_VALUE;
        double dobMin = Double.MIN_VALUE;
        System.out.println("dobMin = " + dobMin);
        System.out.println("max = " + max);

        System.out.println("_______________________");

        String s1 = "TRUE";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);
        System.out.println("--------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2) + 1;
        int y = Integer.valueOf(s2);
        System.out.println(x + "\n" + y);

        System.out.println("--------------------------------------------");

        String s3 = "1.5";
        Double tg = Double.valueOf(s3);
        System.out.println(tg + 1);
        double dob = Double.valueOf(s3);
        System.out.println(dob);
        System.out.println("_________________________");

        char ch1 = '1';

        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);

        char ch2 = 'A';
        boolean r3 = Character.isLetter(ch2);
        System.out.println(r3);
        System.out.println("___________________________");

        String s = "ab1cde2fg3";

        int sum = 0;
char ch[] = s.toCharArray();

        System.out.println(Arrays.toString(ch));


    }
}

