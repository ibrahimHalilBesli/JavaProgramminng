package day36_Inheritance.sport;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private int numberOfReferre;
    public String rules;


    public Sport(String name, int numberOfPlayers, int numberOfReferre, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }

    public void play(){

        System.out.println(name+" is playing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void setNumberOfReferre(int numberOfReferre) {
        this.numberOfReferre = numberOfReferre;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
