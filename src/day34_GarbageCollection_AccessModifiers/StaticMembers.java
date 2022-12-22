package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1{

    }
    public static int a= 100;

    public static void method(){

    }
    static {

    }

}

class C{ //outer class

        static class B{ //inner class

        public static void method1(){

        }
    }
}

class D{

    public static void main(String[] args) {

        C.B.method1();  //method calling von inner class
    }
}