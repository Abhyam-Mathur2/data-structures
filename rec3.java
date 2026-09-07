import java.util.Scanner;
public class rec3 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        rec(n,1);
    }
    public static void rec(int n,int count){
        if(count>n) {
            return;
        }
        System.out.print(count+" ");
        rec(n,++count);
    }
}

