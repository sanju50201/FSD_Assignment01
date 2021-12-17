package assignmentpackage;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =src.nextInt();
        for ( int i =1; i <= 10; i++){
            System.out.println(n + " * "+i+" = " + n*i);
        }
    }
}
