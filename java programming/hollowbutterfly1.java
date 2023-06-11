//Code is giving o/p or moving from left to right while printing result

import java.util.*;



public class hollowbutterfly1{


    public static void main(String[] args) {


        int n = 5;

        //upper half
        for (int i = 1; i <= n; i++) {
            System.out.print("*");


            //loop for internal spaces 
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }

            
           
            if(i>1)
            {
                System.out.print("*");
            }

           
            //spaces that are in between
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");



            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }



            if(i>1)
            {
                System.out.print("*");
            }

            System.out.println();

  }


  

        //lower half
        for (int i = n; i >= 1; i--) {
            System.out.print("*");


            //internal spaces
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }

            
            if(i>1)
                System.out.print("*");


                //spaces that are in between
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");




            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }


            if(i>1)
                System.out.print("*");

            System.out.println();
        }
    }
}