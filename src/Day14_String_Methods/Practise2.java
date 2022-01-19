package Day14_String_Methods;
import java.util.*;
public class Practise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence 1 :");
        String s1 = scan.nextLine();

        System.out.println("Enter your sentence 2 :");
        String s2 = scan.nextLine();

        int str1 = s1.length();
        int str2 = s2.length();

        if(str1>str2){
            System.out.println(s1);
        }else{
            System.out.println(s2);
        }

    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */