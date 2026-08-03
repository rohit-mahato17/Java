import java.util.*;

public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your number:");
    //   int age = sc.nextInt();

    //   if(age > 18){
    //     System.out.println("Adult");
    //   }else{
    //     System.out.println("Not Adult");
    //   }

    //even or odd
      // int num = sc.nextInt();

      // if(num%2 == 0){
      //   System.out.println("Even");
      // }
      // else{
      //   System.out.println("Odd");
      // }
     
     //else if condition

    //  int a = sc.nextInt();
    //  int b = sc.nextInt();

    //  if(a == b){
    //      System.out.println("Equal");
    //  }else if(a > b){
    //      System.out.println("a is greater value");
    //  }
    //  else{
    //      System.out.println("b is lesser");
    //  }

    // }

    //Q

    // int button = sc.nextInt();

    // if(button == 1){
    //   System.out.println("Hello");
    // } else if(button == 2) {
    //   System.out.println("Namaste");
    // } else if(button == 3) {
    //   System.out.println("Bonjour");
    // } else {
    //   System.out.println("Invalid Button");
    // }

    // }

    //Switch statement
    int button = sc.nextInt();

    switch(button) {
      case 1 : System.out.println("Hello");
      break;
      case 2 : System.out.println("Namesta");
      break;
      case 3 : System.out.println("Bonjour");
      break;
      default : System.out.println("Invalid Button");
    }

    } 

}