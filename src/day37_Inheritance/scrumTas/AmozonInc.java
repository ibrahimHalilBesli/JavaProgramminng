package day37_Inheritance.scrumTas;

public class AmozonInc {

    public static void main(String[] args) {


    String company = "Amozon Inc";
    ProductOwner po = new ProductOwner("Suhaib",26,'M',1,160000,company);

    BusinessAnalyst ba = new BusinessAnalyst("Xalo",26,'M',2,10.500,company);

    ScrumMaster sa = new ScrumMaster("Ramo",27,'F',4,90950,company);

    Tester tester = new Tester("Fido",50,'F',"QA",1415,125000,company);
        Tester tester1 = new Tester("Salamon",45,'F',"QE",1416,125000,company);
        Tester tester2 = new Tester("Johnny",24,'F',"SDEt",1417,125000,company);
        Tester tester3 = new Tester("Johnny",53,'F',"QA",1418,125000,company);

        Tester[] testers = {tester,tester1,tester2,tester3};

        Developer developer = new Developer("Hilo",22,'F',"DEV0",10,900000,company);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sa);

        scrumTeam.addTesters(testers);
        scrumTeam.addDeveloper(developer);

        System.out.println(scrumTeam);

        for (Tester tester4 : scrumTeam.testers) {

            System.out.println(tester4.name+" : "+tester4.salary);
        }





    }
}
