package day35_Encapsulation.encapsulation.taskK;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    /*
    1.2 Create a class named CandyFactory
Create an ArrayList of candies
Add five objects of candies
use for each loop to print the brand and price of each
candy
     */

    public static void main(String[] args) {

        Candies candies1 = new Candies("candy",1,5,true);
        Candies candies2 = new Candies("Choco",5,15,false);

        ArrayList<Candies> candies = new ArrayList<>(Arrays.asList(candies1,candies2));

        for (Candies candy : candies) {

            System.out.println(candy.getBrand()+":"+candy.getPrice());
            ArrayList<String> res =new ArrayList<>();

        }

    }
}
