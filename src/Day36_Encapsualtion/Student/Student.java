package Day36_Encapsualtion.Student;

public class Student {
    private String name, schoolName;
    private int age;
    private char grade, gender;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            System.err.println("invalid age");
        }
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.exit(1);
        }
        this.gender = gender;
    }

    public Student(String name, String schoolName, int age, char grade, char gender) {
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
        setName(name);
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */