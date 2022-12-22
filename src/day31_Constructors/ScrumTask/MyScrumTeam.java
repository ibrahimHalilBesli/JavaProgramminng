package day31_Constructors.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 =new Tester(1,"Umut",'F',"QA",110000,1111);
        Tester tester2=new Tester(2,"Ali",'F',"SDET",142000,2222);
        Tester tester3=new Tester(3,"Alex",'F',"SE",135000,22222);
        Tester tester4= new Tester(4,"Lala", 'F',"SDET",115000,11111);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer[] developers={developer2,developer3,developer4};


        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("-------------------------------------------");

        for (Tester eachTester:scrum.testersList){
            System.out.println(eachTester.getName() +" : "+ eachTester.getSalary());

        }

        System.out.println("-----------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------");

        scrum.removeTester( 23 );
        scrum.removeDeveloper( 22 );

        System.out.println(scrum);



    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
