import java.util.*;



public class hollowbutterfly {


    public static void main(String[] args) {

        int n=5;
        


        //upper half(first part)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                if(j==1 || j==10 || j==2 || j==3 || j==4 || j==5  || j==6 || j==7 || j==8 || j==9 ){

                    System.out.print("*");

                }

                else{
                    System.out.print(" ");
                }
                
            }


            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){

                System.out.print(" ");
            }


            //upper half(second part)
            for(int j=1;j<=i;j++){

                if(j==1 || j==10 || j==2 || j==3 || j==4 || j==5  || j==6 || j==7 || j==8 || j==9 ){

                    System.out.print("*");

                }

                else{
                    System.out.print(" ");
                }
                
            }
            

            System.out.println();
        }

        //lower half(first part)
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){

                if(j==1 || j==10 || j==2 || j==3 || j==4 || j==5  || j==6 || j==7 || j==8 || j==9 ){

                    System.out.print("*");

                }

                else{
                    System.out.print(" ");
                }
                
            }

            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){

                System.out.print(" ");
            }


            //lower half(second part)
            for(int j=1;j<=i;j++){

                if(j==1 || j==10 || j==2 || j==3 || j==4 || j==5  || j==6 || j==7 || j==8 || j==9 ){

                    System.out.print("*");

                }

                else{
                    System.out.print(" ");
                }
                
            }

            System.out.println();
        }

        
    
}


}
