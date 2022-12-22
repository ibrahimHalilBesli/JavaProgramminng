package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12"+1);  //121, concatenation
        System.out.println(10+20);    //Addition
        System.out.println(50-40);    //Subtact
        System.out.println(50*40);      //Multiplication

        System.out.println(100/3); //33
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = a/6;

        System.out.println(b);

        double c = (double) a/6;      //6nin yanina 'd' ekle tam sayi 0 ekle ayni 

        System.out.println(c);
    }
    
}

/*
   +:Addition
   -:Subtract
   *:Multiplication
   /: Division
   %:Remainder
                     integer / integer ====> integer
                     decimal / integer ====> decimal
                     integer / decimal 0===> decimal
                     decimal / decimal =====> decimal
in math:
10/4 = 2.5

in Java
10/4 = 2
10.0/4 = 2.5
 */