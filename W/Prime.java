
import java.util.*;

public class Prime {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
       int n = 21;
       ArrayList factors = new ArrayList();
       boolean prime = true;

       for(int i=2; i<n; i++){
           if(n % i == 0){
               prime = false;
               break;
           }
       }

       if(!prime){
           System.out.println("Bilangan Bukan Prima");
       }else{
           System.out.println("Bilangan Prima");
       }
    }
}