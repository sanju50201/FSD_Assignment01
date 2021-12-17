package assignmentpackage;

import java.util.Scanner;

public class nCrnPr
{
    public static void main(String[] args)
    {
        int n, r, ncr, npr;
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = src.nextInt();
        System.out.println("Enter the value of r: ");
        r = src.nextInt();
        npr = (fact(n)) / (fact(n-r));
        ncr = (fact(n)) / (fact(r)*fact(n-r));
        System.out.println("\nnCr = " +ncr);
        System.out.println("nPr = " +npr );
    }
    public static int fact (int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;
            return fact;
        }
    }
