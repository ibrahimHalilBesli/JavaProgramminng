package utilities;

import day40_Finalkeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {
        System.out.println(name2);

       // System.out.println(name1); default is not visible

        AccessModifiers_Test4.method2();

    }
}
