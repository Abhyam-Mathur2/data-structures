import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=ob.nextInt();
        patternprint(n);
    }
    public static void patternprint(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
