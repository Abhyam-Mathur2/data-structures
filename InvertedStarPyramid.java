import java.util.Scanner;
public class InvertedStarPyramid {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*(n-i)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
