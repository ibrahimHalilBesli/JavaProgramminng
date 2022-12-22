package weekReview.week9;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {7, 8, 9, 10};

        int[][] twoDimenArray = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}}; //third array //2

        int[][] array2D = {firstArray, secondArray, thirdArray};

        System.out.println(twoDimenArray[0][1]); //in order to reach 2 first we need to go to first array by using
        // index of array which is 0 then I need to go to that element by using index of element which is 1
        System.out.println(twoDimenArray[2][2]);
        //3 row number
        for (int i = 0; i < twoDimenArray.length; i++) { // in order to go to array one by one
            System.out.println(i + 1 + ". array ");
            //column number
            for (int j = 0; j < twoDimenArray[i].length; j++) { // this is for finding element inside inner array
                System.out.println(twoDimenArray[i][j]);

            }
            System.out.println("=============");


        }


        int[][][] array3D = {
                {
                        {1, 2, 3},
                        {4, 5, 6}

                },
                {
                        {1, 2, 3},
                        {4, 5, 6}

                }

        };


    }
}
