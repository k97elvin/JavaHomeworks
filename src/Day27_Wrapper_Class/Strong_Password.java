package Day27_Wrapper_Class;

public class Strong_Password {
    public static void main(String[] args) {
        String password = "Elvin1234@";

        boolean length = password.length() > 8;
        boolean upperCase = false;
        boolean space = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                upperCase = true;
            } else if (Character.isLowerCase(each)) {
                lowerCase = true;
            } else if (Character.isDigit(each)) {
                digit = true;
            } else {
                specialChar = true;
            }



        }
        boolean isStrongPassword = length && upperCase && lowerCase && specialChar && space && digit;
        System.out.println(isStrongPassword);
    }
}
/*
Warmup tasks:
1.Write a program that can verify if a password is a strong
password. Characteristics of strong passwords are:
1.1 Password must be at least have 8 characters long, and should
not contain space
1.2 PassWord should at least contain one upper case letter
1.3 PassWord should at least contain one lower case letter
1.4 Password should at least contain one special characters
1.5 Password should at least contain a digit
 */