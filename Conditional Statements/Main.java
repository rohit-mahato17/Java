import java.util.*;

public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age:");
    //   int age = sc.nextInt();

    //   if(age > 18){
    //     System.out.println("Adult");
    //   }else{
    //     System.out.println("Not Adult");
    //   }

    //even or odd
      int num = sc.nextInt();

      if(num%2 == 0){
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }

    }
}