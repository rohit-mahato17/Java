import java.util.*;

public class Q {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to input marks");
            System.out.println("Enter 0 then stope the program");
            choice = sc.nextInt();
            
            if(choice == 1) {
                System.out.println("Enter Student's marks (0-100): ");
                int marks = sc.nextInt();

                if(marks >= 90) {
                    System.out.println("This is Good");
                }else if(marks >= 60) {
                    System.out.println("this is also good");
                }else if(marks >= 0){
                    System.out.println("This is good as well");
                }else{
                    System.out.println("Invalide marks!");
                }
            }
        }while (choice != 0);

            System.out.println("program stopped");
            sc.close();
    }
}