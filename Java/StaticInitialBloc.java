package Java;

import java.util.Scanner;

/* Hacker Rank area of the parallelogram.*/
public class StaticInitialBloc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt(), height = sc.nextInt();
        if (breadth>0 && height>0) {
            System.out.println(breadth*height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
