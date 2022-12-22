package day36_Inheritance.scrumTeam;

public class Developer extends Employee{

    public void code(){

        System.out.println(getName()+" is coding");
    }

    public void bugs(){

        System.out.println(getName()+" is fixing bugs");
    }


}
