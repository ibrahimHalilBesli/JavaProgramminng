package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "US morning";
        String time = "";

        boolean batcht= batch == "US morning" ||batch== "US evening" ||batch== "EU";

        if (batcht){
            switch (batch){

                case "US morning":
                    time = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    time="Class times are 7-10 M,T,W,TH,S,S.";
                    break;
                case "EU":
                    time="Class times are 10-5 EST. M,T,W,Th,F.";
                    break;

            }

        }   else {
            System.out.println("Invalid Batch");
        }
        System.out.println(time);
    }
}
