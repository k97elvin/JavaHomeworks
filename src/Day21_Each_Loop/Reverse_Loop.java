package Day21_Each_Loop;

public class Reverse_Loop {
    public static void main(String[] args) {
        String str = "";
        String res = "";
        for (int i = str.length()-1; i >=0 ;i--) {
            res += str.charAt(i);
        }
    }
}
