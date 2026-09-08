import java.util.Scanner;
public class rec {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Eneter a no: ");
        int n=ob.nextInt();
        int c=recur(n);
        System.out.println("Sum is "+ c);
    }
    public static int recur(int n){
       if(n==0){
           return 0;
       }
       return n+ recur(n-1);
    }
}
