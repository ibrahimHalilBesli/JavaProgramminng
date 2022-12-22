package day35_Encapsulation.encapsulation.taskK;

public class Pizza {

    /*
    5. Pizza Task:
5.1 Create class named Pizza:
private variables:
size, numberOfCheeseTopping,
numberOfPepperoniTopping
Encapsulate all the fields
Conditions:                                 
size of the
pizza can only be small, medium, large. case insensitive
Number of
cheese topping can not be negative, the maximum number of cheese topping
is:
small: 3
medium: 4
large: 5
Number of
pepperoni topping can not be negative, the maximum number of pepperoni
topping is:
small: 4
medium: 5
large: 6
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcCost(): returns the
totalCost of the pizza
toString():returns a String
containing the pizza size, quantity of each topping, and the pizza cost as
calculated by calcCost()
Pizza cost is determined by:
S: $10 + $2 per topping
M: $12 + $2 per topping
L: $14 + $2 per topping
     */
private String size;
private int numberOfCheeseTopping;
private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public void setSize(String size) {

        boolean grosSize = size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large");

        if (size==null||!grosSize){
            System.err.println("Invalid Size "+size);
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if(numberOfCheeseTopping < 0){
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.out.println("Invalid number of cheese topping: "+numberOfCheeseTopping);
            System.exit(1);
        }

        }



    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfPepperoniTopping<0){

            System.err.println("Invalid Number Of Pepperoni Topping "+numberOfPepperoniTopping);
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small")&&numberOfPepperoniTopping<=3){
            this.numberOfPepperoniTopping=numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("medium")&&numberOfPepperoniTopping<=4) {

            this.numberOfPepperoniTopping=numberOfPepperoniTopping;

        } else if (size.equalsIgnoreCase("large")&&numberOfPepperoniTopping<=5) {
            this.numberOfPepperoniTopping=numberOfPepperoniTopping;

        }else{
            System.err.println("Invalid Number of Pepperoni Topics: "+numberOfPepperoniTopping);
            System.exit(0);
        }
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public double calcCost(){


        double price = (size.equalsIgnoreCase("small"))? 10 :(size.equalsIgnoreCase("medium"))? 12
                :14;
        double total = price+2*(numberOfPepperoniTopping+numberOfCheeseTopping);

        return total;


    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Price=" + calcCost() +
                '}';
    }
}

class TestPizza{

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,3);

        System.out.println(pizza1);
    }
}
