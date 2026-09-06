import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a two no");
        int n=ob.nextInt();
        int m=ob.nextInt();
        int ans=gcdn(n,m);
        System.out.println(ans);
    }
    public static int gcdn(int a,int b){
        if(b==0){
            return a;
        }
        return gcdn(b,a%b);
    }
}
