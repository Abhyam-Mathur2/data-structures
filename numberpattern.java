import java.util.Scanner;
public class numberpattern {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        int size=2*n-1;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size; j++) {
                int top=i;
                int left=j;
                int bottom=size-1-i;
                int right=size-1-j;
                int pos=Math.min(Math.min(left,top),Math.min(bottom,right));
                System.out.print(n-pos+" ");
            }
            System.out.println();
        }
    }
}
