//Print a given name in a function
import java.util.*;

public class Funtion {
    // public static void printMyName(String name) {
    //    System.out.println(name);
    //    return;
    // }

    // public static int calculateSum(int a, int b){
    //     // int sum = a + b;
    //     // return sum;
    //     return a*b;
    // }

    public static int factorialOfNumber(int n){
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }

        return fact;
    }
    //Find the factorial of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // printMyName(name);
        // int sum = calculateSum(a,b);
        // System.out.println("Sum of twonumber is:"+sum);

        int n = sc.nextInt();

       int fact = factorialOfNumber(n);
       System.out.println("The factoreal of a number is :"+fact);
    } 
}
