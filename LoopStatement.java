
import java.util.*;

public class LoopStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // for(int i=1; i<=n; i++){
        //     System.out.println(i);
        // }

        // Sum of input

        // int sum = 0;

        // for(int i=1; i<=n; i++){
        //    sum += i;
        // }
        // System.out.print("The value of sum:");
        // System.out.println(sum);

        // while loop
        // int i=1;

        // while(i <= n){
        //     System.out.println(i);
        //     i++;
        // }

        //do while

        // int i=1;
        // int n = 5;

        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i <= n);
        
        //print 2 table

        // for(int i=1; i<11; i++){
        //     System.out.println(i*n);
        // }

        // for(int i=1; i<=n; i++){
        //     if(i%2 == 0){
        //         System.out.println(i);
        //     }
        // }

        // for(; ;) {
        //     System.out.print("Empty condition");
        // }

        int marks = 60;

        if(marks >= 90) {
            System.out.println("This is Good");
        } else if(89 >= marks >= 60) {
            System.out.println("This is also Good");
        }else if(59 >= marks >= 0) {
            System.out.println("This is good as well");
        }
        
    }
}