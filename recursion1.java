import java.util.Scanner;
public class recursion1 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        rec(n);
    }
    public static void rec(int n){
        if(n==0){
            return;
        }
        System.out.print("Abhyam ");
        rec(n-1);
    }
}
