package day33_Statics.practiceTask;

public class CydeoStudent {

    public String name;
    public int age, batchNumber, groupNumber;
    public char grade;
    public static String schoolName= "Cydeo";
     public static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }


    public void study(){
        System.out.println(name+" is study");
    }

    public void attendClass(){
        System.out.println(name+" attend to class");
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}


/*
Create a class named CydeoStudent:
    Attributes:
    instances: name, age,
    gender, id, grade, batchNumber, groupNumber
    statics: schoolName,
    programmingLanguage
    Add a constructor that can set All the
    fields (instances)
    Actions:
    study()
    attendClass()
    printSchoolName(): displays
    the school name
    printProgLanguage():
    displays the name of programming language
    toString()
 */
