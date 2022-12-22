package day31_Constructors.PracticeTask.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        CalledServer[] servers={
                new CalledServer("Halo",10,40,true),
                new CalledServer("Zeyno",11,40,false),
                new CalledServer("Fido",12,40,true),
                new CalledServer("Musto",13,40,false),

        };

        Chef[] chefs={new Chef("Xalo",1,45,true),
                new Chef("Fido",2,50,true)
        };

        Restaurant restaurant= new Restaurant("Besli","Antalya",4);
        restaurant.hireServer(servers);
        restaurant.hireChefs(chefs);


        System.out.println(restaurant);

        /*
        6.4. Create a class LocalRestaurant that has a main
    method with the following:
        - Make a Restaurant object
        - Create an array of servers with their
        information set. Add those initial servers to the ArrayList of Servers in
        the Restaurant object
            - Create an array of chefs with their
        information set. Add those initial chefs to the ArrayList of Chefs in the
        Restaurant object
            - Print your whole restaurants information
         */

    }
}
