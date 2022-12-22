package day36_Inheritance.scrumTeam;

public class AmazonInc {

    public static void main(String[] args) {

        ScrumTeam scrumTeam =new ScrumTeam("Ramo","Xalo","fido");

        Tester tester = new Tester();
        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester.setInfo("Xalo",24,'F',10,"Qa",1000," Bba");
        tester1.setInfo("Xalo",24,'F',10,"Qa",1000," Bba");
        tester2.setInfo("Xalo",24,'F',10,"Qa",1000," Bba");
        tester3.setInfo("Xalo",24,'F',10,"Qa",1000," Bba");

        Tester[] testers = {tester,tester1,tester2,tester3};

        Developer developer= new Developer();
        developer.setInfo("SA",24,'M');
       scrumTeam.addTEster(testers);
        System.out.println(scrumTeam);

    }
}
