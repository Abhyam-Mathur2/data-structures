import java.util.Scanner; //logn
public class armstrong {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=ob.nextInt();
        int d=digit(n);
        int ans=arm(n,d);
        if(ans==n){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
    public static int digit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static int arm(int n,int d){
        int a=0;
        while(n>0){
            int di=n%10;
            a=a+(int)Math.pow(di,d);
            n=n/10;
        }
        return a;
    }
}
