import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=ob.nextInt();
        int count=countd(a);
        System.out.println(count);
    }
    public static int countd(int a ){
        int c=0;
        while(a>0){ //O(logn)
            c++;
            a=a/10;
            /*oprimal solution
            int c=(int)(Math.log10(a)+1); // O(1)
             */
        }
        return c;
    }
}
