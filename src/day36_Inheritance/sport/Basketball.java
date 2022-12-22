package day36_Inheritance.sport;

public class Basketball extends Sport{



    public Basketball(String name, int numberOfPlayers, int numberOfReferre, String rules) {
        super(name, numberOfPlayers, numberOfReferre, rules);
    }


    public void score(){
        System.out.println(getName()+" is scored");


    }


}
