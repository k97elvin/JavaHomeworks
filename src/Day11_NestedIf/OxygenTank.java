package Day11_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {
        int number = 88;
        String result = "";
     /*   String result = number >= 0 && number <= 100 ? number > 90 ? "Your tank is full" : number > 80 ? "Still okay"
                : number > 70 ? "Don't go too far" : number > 60 ? "Start to head back" :  "Be careful now you are at 50%"
                : "invalid number";
        System.out.println(result);*/

//readable version:
        if(number >= 0 && number <= 100) {result =   number > 90 ? "Your tank is full" : number > 80 ? "Still okay"
                : number > 70 ? "Don't go too far" : number > 60 ? "Start to head back" :  "Be careful now you are at 50%";}
        else{ result = "invalid number";}
        System.out.println(result);
    }
}


/*
Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */
