import java.util.Scanner;
public class pyr {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
