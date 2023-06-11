import java.util.*;

public class diamond {

    public static void main(String[] args){


        int n=4;

        //upper half
        for(int i=1;i<=n;i++){

            
            //spaces
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
            }

            //this is giving half diamond because in this loop is going from 1 to i 
            for(int j=1;j<=i;j++){

                  System.out.print("*");
            }

            System.out.println();


        }


        //lower part

        for(int i=n;i>=1;i--){

            
            //spaces
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){

                  System.out.print("*");
            }

            System.out.println();


        }


    }
    
}
