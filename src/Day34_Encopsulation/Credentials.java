package Day34_Encopsulation;

public class Credentials {
    private String userName, password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void isStrongPassword() {
        boolean has8Chars = password.length() >= 8 || !password.contains(" ");
        boolean isLetter = false;
        boolean isDigit = false;
        boolean isSpecialChar = false;


        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                isLetter = true;
            } else if (Character.isDigit(password.charAt(i))) {
                isDigit = true;
            } else {
                isSpecialChar = true;
            }

        }
        boolean stringPassword = has8Chars && isDigit && isSpecialChar && isLetter;
        if (stringPassword) {
            System.out.println("Password is strong");
        } else {
            System.err.println("Password is not strong");
        }
    }

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}

/*2. create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)



 */