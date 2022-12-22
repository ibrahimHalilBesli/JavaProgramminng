package utilities;

public class ArrayList {
    public static void combineArray(java.util.ArrayList<String> arr1, java.util.ArrayList<String> arr2 ){
        java.util.ArrayList<String> arrayList=new java.util.ArrayList<>();
        arrayList.addAll(arr1);
        arrayList.addAll(arr2);
        System.out.println(arrayList);
    }
    public static int maximumNum(java.util.ArrayList<Integer> list){


        int max = list.get(0);

        for (Integer each : list) {
            if (each>max){
                max=each;
            }

        }

        return max;

    }
    public static int minimumNumber(java.util.ArrayList<Integer> list){

        int minimum = list.get(0);

        for (Integer each : list) {
            if (each<minimum)
                minimum=each;
        }
        return minimum;
    }
}
