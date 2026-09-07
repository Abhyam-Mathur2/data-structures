import  java.util.Scanner;
public class rec2 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=ob.nextInt();
        rec(n);
    }
    // printing in reverse
    public static void rec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        rec(n-1);
    }
}
