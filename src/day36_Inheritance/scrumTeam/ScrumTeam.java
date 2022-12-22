package day36_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO,BA,SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {

        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers= new ArrayList<>();
        developers=new ArrayList<>();

    }

    public void addTEster(Tester tester){
        testers.add(tester);
    }
    public void addTEster(Tester[] tester){
        testers.addAll(Arrays.asList(tester));
    }

    public void removeTester(int id){

        testers.removeIf(p-> p.getiD()==id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));

    }

    public void removeDeveloper(int id){
        developers.removeIf(p-> p.getiD()==id);

    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
