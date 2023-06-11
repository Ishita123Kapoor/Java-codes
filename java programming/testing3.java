import java.util.*;


public class testing3 {

    public static void main(String[] args) {


        int n = 5;

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

        System.out.println();
    
}

} 


}
