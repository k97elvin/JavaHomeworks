package Day13_Switch_And_ScannerIntro;

public class browser2 {
    public static void main(String[] args) {
        String name = "firefox";
        String result = "";
        switch (name) {
            case "chrome":
//       System.out.println("chrome");
                result = "chrome";
                break;
            case "firefox":
//         System.out.println("firefox");
                result = "firefox";
                break;
            case "opera":
//        System.out.println("opera");
                result = "opera";
                break;
            case "safari":
//               System.out.println("safari");
                result = "safari";
                break;
            case "edge":
//             System.out.println("edge");
                result = "edge";
                break;
            default:
                System.out.println("invalid");


        }
        System.out.println(result);

    }
}
/*
3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */