package day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "Iphone 12 case"};
        //                  0       1           2           3       4       5
        double [] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
                    //        0     1       2     3      4      5
        int [] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};
                    //      0       1   2       3       4       5


        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int iD = itemIds[i];
            System.out.println(item+" - "+iD+" -$ "+price);


        }
    }
    }
