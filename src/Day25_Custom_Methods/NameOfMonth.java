package Day25_Custom_Methods;

public class NameOfMonth {
    public static void main(String[] args) {
        name(2);
    }
    public static void name(int numOfMonth){
     if (numOfMonth>=1&&numOfMonth<=3){
         String str =  (numOfMonth==1)?"Jan" :(numOfMonth==2)? "Feb":"Mar";
         System.out.println(str);
     }else {
         System.out.println("Invalid");
     }

    }
}
