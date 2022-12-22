package day35_Encapsulation.encapsulation.taskK.restaurant;

public class RestaurantObject {
    public static void main(String[] args) {

       CalledSErver calledSErver = new CalledSErver("Xalo",12,40,true,1000);
        CalledSErver calledSErver1 = new CalledSErver("Salo",12,40,true,1000);
        CalledSErver calledSErver2 = new CalledSErver("Malo",12,40,true,1000);
        CalledSErver calledSErver3 = new CalledSErver("Lal",12,40,true,1000);
        CalledSErver calledSErver4 = new CalledSErver("Tal",12,40,true,1000);

        CalledChef chef = new CalledChef("Ramo",33,22,true,1000);

        Restaurant restaurant = new Restaurant("Ssa","Antalya",2);

        restaurant.hireChef(chef);
        CalledSErver[] arr = {calledSErver1,calledSErver2,calledSErver3,calledSErver4};
        restaurant.hireServer(arr);


        System.out.println(restaurant);





    }
}
