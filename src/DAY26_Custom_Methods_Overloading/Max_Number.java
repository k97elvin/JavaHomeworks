package DAY26_Custom_Methods_Overloading;

public class Max_Number {
    public static void main(String[] args) {
      String res =   maxNumber(7,9);
        System.out.println(res);
    }
    public static String maxNumber(int num1, int num2){
     String  r = (num1>num2)? num1+ " is max" : num2 +" is max.";
      return r;
    }
}
