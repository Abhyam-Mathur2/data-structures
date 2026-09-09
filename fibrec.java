import java.util.*;
public class fibrec {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a=ob.nextInt();
        int ans=fib(a);
        System.out.print(ans);
    }
    public static int fib(int a){
        if(a<=1){
            return a;
        }
        return fib(a-1) + fib(a-2);
    }
}
