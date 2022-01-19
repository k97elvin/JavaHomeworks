package Day38.StudentTask;

public class CydeoStudent extends Student {
    private int batchNum, groupNum;
    private String programingLanguage;




    public int getBatchNum() {
        return batchNum;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }


    public void setBatchNum(int batchNum) {
        if (batchNum <= 0) {
            System.err.println("batchNum");
            System.exit(1);
        }
        this.batchNum = batchNum;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (programingLanguage.isEmpty()){
            System.err.println("program language");
            System.exit(1);
        }
        this.programingLanguage = programingLanguage;
    }

    public void setGroupNum(int groupNum) {
        if (groupNum <= 0) {
            System.err.println("groupNum");
            System.exit(1);
            this.groupNum = groupNum;
        }


    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating with" + programingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking with" + programingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping with" + programingLanguage);
    }

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                "batchNum=" + batchNum +
                ", groupNum=" + groupNum +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
/*
3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


 */