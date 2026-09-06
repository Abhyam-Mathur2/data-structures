import java.util.Scanner;
public class rverseano {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=ob.nextInt();
        reversen(n);
    }
    public static void reversen(int n){
        int ne=0;
        while(n>0){ //O(logn)
            int d=n%10;
            ne=ne*10+d;
            n=n/10;
        }
        System.out.println(ne);
    }
}
