package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("\"Main Block\" = " + "Main Block");
    }

    static { //runs first before anything and only runs one time
        System.out.println("Static Block");
    }

    static {
        System.out.println("Static Block 2");
    }

    static {
        System.out.println("Static Block 3");
    }
}
