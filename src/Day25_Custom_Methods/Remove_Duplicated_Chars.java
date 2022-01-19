package Day25_Custom_Methods;

public class Remove_Duplicated_Chars {
    public static void main(String[] args) {
        String str = "ccccddddaaaabbb";
   str = removeDuplicate(str);
        System.out.println(str);
    }

    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (!str.contains(""+ ch)) {
                result += ch;
            }
        }
        return result;



    }


}
       /* String str = "EEEEERRRRRRTTTTTT";
        str=nonDuplicate(str);
        System.out.println(str);
    }
    public static String nonDuplicate(String str){
        String result="";
        for (int i = 0; i< str.length();i++){
            String ch = ""+str.charAt(i);
            if (!(str.contains(ch))){
                result+=ch;
            }
        }
        return result;
    }
}*/
/*1. create a method that can remove duplicated characters from a string and returns the new value
 */
/*1. create a method that can remove duplicated characters from a string and returns the new value
 */