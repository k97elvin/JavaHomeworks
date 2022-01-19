package Switch_Statements;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
        switch (browser) {
            case "chrome":
                System.out.println("chrome browser is selected");
                break;
            case "firefox":
                System.out.println("firefox browser is selected");
                break;
            case "opera":
                System.out.println("opera browser is selected");
                break;
            default:
                System.out.println("Safari browser is selected");
        }
    }
}
/*1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
        String browser = "chrome";

        Output:
        Chrome Browser is selected

        Note: MUST use nested if

 */