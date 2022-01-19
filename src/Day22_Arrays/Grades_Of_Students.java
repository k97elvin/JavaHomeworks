package Day22_Arrays;
import java.util.Arrays;
public class Grades_Of_Students {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
           if(scores[i]>=90){
               grades[i]='A';
           }else if(scores[i]>=80){
               grades[i]='B';
           }else if(scores[i]>=70){
               grades[i]='c';
        }else {
               grades[i]='F';

           }  System.out.println(names[i] +" - " + scores[i]+" - " +grades[i]);
    }
}}
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A


	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */