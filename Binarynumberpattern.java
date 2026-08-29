import java.util.Scanner;
public class Binarynumberpattern {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
