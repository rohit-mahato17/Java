public class Patterns {
    public static void main(String[] args) {
       
    //    for(int i=1; i<=4; i++){
    //       for(int j=1; j<=5; j++){
    //         System.out.print("*");
    //       }
    //       System.out.print("\n");
    //    }

    //Hollow rectangle
    // int n = 4;
    // int m = 5;
    
    // //outer loop
    // for(int i=1; i<=n; i++){
    //    //inner loop
    //    for(int j=1; j<=m; j++){
    //       if(i == 1 || j == 1 || i == n || j == m){
    //         System.out.print("*");
    //       } else {
    //           System.out.print(" ");
    //       }
    //    }
    //    System.out.println();
    // }

    // int n=5;

    // for(int i=1; i<=n; i++){
    //     for(int j=i; j<=n; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // int n=4;

    // for(int i=n; i>=1; i--) {
    //     for(int j =1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //       System.out.println();
    // }

    // int n = 4;
    
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // }

    // int n = 5;

    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // for(int i=n; i>=1; i--) {
    //     for(int j=1; j<=i; j++) {
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // } 
    //    int k=1;
    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++){
    //         System.out.print(k+" ");
    //         k++;
    //     }
    //     System.out.println();
    // }

    // int n = 5;

    // for(int i=1; i<=n; i++) {
    //     for(int j=1; j<=i; j++) {
    //         int sum = i+j;
    //         if(sum % 2 == 0) {
    //             System.out.print("1 ");
    //         } else {
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }

    int n=4;
    
    //upper half
    for(int i=1; i<=n; i++) {

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        int space = 2 * (n-i);
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        //2nd part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }

        for(int i=n; i>=1; i--) {
        //1st part
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        
        //space
        int space = 2 * (n-i);
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        //2nd part
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }

    }

}