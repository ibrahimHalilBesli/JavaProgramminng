package day20_Arrays;

public class Shops {
    /*
    3. Given the following arrays:
String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
"iPad", "iPhone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,
439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
12350};
1. find out the first index number of "Gloves"
2. find out if "iPad" is contained in the item list
3. Print the report of each shopping item
name - price - #ID
     */

    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "Iphone 12 case"};
        double [] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int [] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i <items.length  ; i++) {

            String itemname = items[i];
            double price = prices[i];
            int itemId = itemIds[i];

            if (itemname.equals("Gloves")){
                int index = i;
                System.out.println(index);
            }
            if (itemname.equals("Ipad")){
                boolean hasIpad = true;
                System.out.println(hasIpad);
            }
            System.out.println("Item Name: "+itemname+"Item Price: "+price+"Item Id: "+itemId);
        }
    }
}
