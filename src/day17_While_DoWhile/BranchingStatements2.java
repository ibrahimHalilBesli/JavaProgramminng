package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i ='A'; i<='E';i++){

            if (i=='C'){
                continue;
            }
            System.out.println(i); //A B D E

        }
        System.out.println("------------------------");
        //print all even num (Skip odd numbers )
        for (int i = 1; i<11; i++){
            if (i%2 !=0){  //1.3.5.7.9
                continue;
            }
            System.out.println(i);  //2, 4 , 6, 8
        }

        System.out.println("------------------------");
        //skip the even numbers

        for (int i = 1; i<11; i++){
            if (i%2 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
