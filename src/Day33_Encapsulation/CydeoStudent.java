package Day33_Encapsulation;

public class CydeoStudent {
    public static int batchNumber, secretCode;
    public static String schoolName, programmingLanguage;
    public String name, gender, fieldOfStudy;

    public CydeoStudent(String name, String gender, String fieldOfStudy, int age) {
        this.name = name;
        this.gender = gender;
        this.fieldOfStudy = fieldOfStudy;
        this.age = age;
    }

    public int age;

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        batchNumber = 25;
        secretCode = 18;

    }

    public void printSchoolName(String schoolName) {
        System.out.println(schoolName);
    }

    public static void printSecretCode(int secretCode) {
        System.out.println(secretCode);
    }

    public  void attendClass() {
        System.out.println(name + " is attended");

    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", age=" + age +
                "batch number "+ batchNumber +
                '}';
    }
}
/*
    2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */