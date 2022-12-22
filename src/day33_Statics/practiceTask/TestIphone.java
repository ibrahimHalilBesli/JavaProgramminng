package day33_Statics.practiceTask;

import day33_Statics.practiceTask.Iphone;

public class TestIphone {

    public static void main(String[] args) {

        //System.out.println(Iphone.oS);

        Iphone iphone1 = new Iphone("Iphone 13",1099.99,"Red","Promax");
        Iphone iphone2 = new Iphone("Iphone 12",999.99,"Blue","Max");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.method1();
        iphone1.call(1739227087L);
        iphone1.faceTime(1739227087);
        iphone1.faceTime("ihalilbesli@icloud.com");
        iphone1.text(1739227087);
        System.out.println(iphone1.brand);


    }
}
