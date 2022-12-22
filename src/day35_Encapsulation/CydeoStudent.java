package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;

    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="CYDEO";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";


    }

    public static void printSchoolName(){
        System.out.println("School is "+schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println("language is "+programmingLanguage);
    }
    public static void printSecretCode(){

        System.out.println("Secret Code is :"+secretCode);
    }
    public void attendClass(){
        System.out.println(name+" is attending class.");
    }
    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", prgramming language='" + programmingLanguage + '\'' +
                '}';
    }
}
