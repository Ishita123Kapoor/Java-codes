//important code

import java.util.*;


public class pascaltriangle {

    public static void main(String[] args ) {

        int n=5;

        //outer loop
        for (int i=0; i<=n; i++) {


            //inner loop for spaces
            for(int j=1; j<n-i+6; j++){

                System.out.print(" ");
            }


            //inner loop for printing of numbers in the pattern 
            //We initialize number =1 because everytime number 1 is printing in the pattern
            //formula used in pascal's triangle question : number = number * (i-j) / (j+1);

            int number = 1;
            for(int j=0;j<=i;j++){

                
                System.out.print(number+" ");
               number = number * (i-j) / (j+1);
            }

            System.out.println();
            
        }


    }
    
}
