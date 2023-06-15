//rule 1 :only one disk transferred in 1 step
//rule 2 :smaller disk are always kept on top of larger disk

//Time complexity : O(2^n-1) approx : 2^n
//How time complexity comes: there are two towerofhanoi function we used so, equation 1 is T(n)=2T(n-1)+1(to transfer disc 1 from helper to destination)
//Equation 2 is T(n-1)=2T(n-2)+1
//Substitute value of eq2 in eq1


import java.util.*;


public class Recurssion2 {

    public static void Towerofhanoi(int n, String src, String helper, String des){

        if(n==1){

            System.out.println("transfer disk "+ n + " from "+src+" to "+des);
            return;
        }

        Towerofhanoi(n-1, src, des, helper);
        System.out.println("transfer disk "+ n + " from "+src+" to "+des);
        Towerofhanoi(n-1, helper, src, des);


    }


     public static void main(String args[]){

        int n=3;

        Towerofhanoi(n, "S", "H", "D");

     }

     
}

    
    

