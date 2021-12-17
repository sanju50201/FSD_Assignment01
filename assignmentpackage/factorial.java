package assignmentpackage;

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        int n,fact=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        int i =1;
        while (i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of the given number is: "+fact);
    }
}