import java.util.Scanner;
public class increasenumbertraingle {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
