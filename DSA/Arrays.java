import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //  int[] marks = new int[3];
        // int marks[] = new int[3];


        //  marks[0] = 97;
        //  marks[1] = 98;
        //  marks[2] = 95;
 
        //  System.out.println(marks[0]);
        //  System.out.println(marks[1]);
        //  System.out.println(marks[2]);
 
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        // System.out.println("Next print");
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int target = 67;
        for(int i=0; i<size; i++){
            if(numbers[i] == target)
            System.out.println("This value is present here");
        }

    }
}
