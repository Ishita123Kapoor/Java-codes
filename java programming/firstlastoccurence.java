//Time complexity = O(n)
//where n is my length of string


import java.util.*;


public class firstlastoccurence {

    public static int first = -1;
    public static int last = -1;

    public static void findoccurence(String str, int index, char element){

        if(index == str.length()){

            System.out.println(first);
            System.err.println(last);
            return;
        }

        char currchar = str.charAt(index);

        if(currchar == element) {

            if(first == -1){

                first = index;
            }

            else{
                last = index;
            }
        }

          findoccurence(str, index+1, element);

      }

       public static void main(String args[]){
                
            String str ="abaacdaefaah";
            findoccurence(str, 0, 'a');

       
        
    }

}
    

