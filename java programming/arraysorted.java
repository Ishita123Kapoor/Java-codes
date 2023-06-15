//Time complexity : O(n)

import java.util.*;


public class arraysorted {

    public static boolean issorted(int arr[], int index) {

        if(index == arr.length-1){

            return true;
    }

        if(arr[index]<arr[index+1]){

            //array is sorted till now
            return issorted(arr, index+1);


        }

        else{
            return false;
        }
        
    }

    public static void main(String args[]){

        int arr[] = {1,3,5};
        System.out.println(issorted(arr, 0));
    }
    
}
