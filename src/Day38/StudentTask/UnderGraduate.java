package Day38.StudentTask;

public class UnderGraduate extends Student {

    public UnderGraduate(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);

    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying for final exam.");
    }
}
/*
2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary
 */