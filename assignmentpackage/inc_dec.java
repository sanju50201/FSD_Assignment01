package assignmentpackage;

public class inc_dec {
    public static void main(String[] args) {
//        Pre-Increment
        int a = 5;
        int b= ++a;
        System.out.println("b value is: "+b);
//        Post-Increment
        int x = 6;
        int y = x++;
        System.out.println("y value is: "+y);
//        Pre-Decrement
        int p = 10;
        int s = --p;
        System.out.println("s value is: "+s);
//        Post-Decrement
        int q = 10;
        int r = q--;
        System.out.println("r value is: "+r);

    }
}
