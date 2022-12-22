package alistirma;


import java.util.Arrays;

public class Deneme {

    public static void main(String[] args) {

      int count = 0;
        for (int a = 0; a < 4; a++) {
            if (a==3) continue;
            for (int b =a+1 ; b <5 ; b++) {
                count++;
                if (b==3) break;
            }
        }
        System.out.println(count);


        int[] nums ={14,1,84,97,1243,46};
        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2!=0){
                tot+=3;
            }else {
                tot+=10;
            }
            if (i%3==0){
                tot-=15;
            }

        }
        System.out.println(tot);

        String[] things = {"house","shed","slide","zebra","park","garden"};
        for (String s : things) {
            switch (s.charAt(1)){
                case 'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);
            }
        }

        String s[]=new String[4];

        String[] st={"A","B","C","D","E"};
        int b = st[5].length();
        System.out.println(b);
    }

}
