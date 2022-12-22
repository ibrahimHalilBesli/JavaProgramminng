package day11_Switch_Scanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 3;
        String companies = "";
        boolean result = floorNumber==1 || floorNumber==2 || floorNumber==3;

        if (result){
            switch (floorNumber){
                case 1:
                    companies= "Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    companies="Cybertek, Nasa, Intelsat";
                    break;

                case 3:
                    companies= "Lyft, BofA, Stake house";
                    break;
            }

        }   else {
            System.out.println("Invalid Floor-6");
        }
        System.out.println(companies);
    }
}
