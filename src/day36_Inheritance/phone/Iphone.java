package day36_Inheritance.phone;

public class Iphone extends Phone{

    public void faceTime(long phoneNum){

        System.out.println(model+"is facetiming with number 0"+phoneNum);
    }
    public void faceTime(String eMail){

        System.out.println(model+" is face timing with email "+eMail);
    }

    /*
    1.2 Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
     */
}
