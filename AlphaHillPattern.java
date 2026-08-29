import java.util.Scanner;
public class AlphaHillPattern {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c='A';
            int mid=(2*i+1)/2;
            for(int k=0;k<(2*i+1);k++){
                System.out.print(c);
                if(k<mid){
                    c++;
                }
                else{
                    c--;
                }
            }
            System.out.println();
        }
    }
}
