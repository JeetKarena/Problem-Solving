package Java;

import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Another Aproch
        String s = t + "";
        if (s instanceof String) {
            System.out.println("Good job");
            // print good
        } else {
            // print wrong answer
            System.out.println("Wrong answer");
        }
        // Another Aproch
        if(t>=-100 || t<=100){
            String str1 = Integer.toString(t);
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
    }
}
