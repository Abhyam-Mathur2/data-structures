import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=ob.nextInt();
        pali(n);
    }
    public static void pali(int n){
        int temp=n;
        int c=0;
        while(n>0){ //O(logn)
            int d=n%10;
            c=c*10+d;
            n=n/10;
        }
        if(c==temp){
            System.out.println("Palindrome no");
        }
        else{
            System.out.println("Not palindrome no");
        }
    }
}
