import java.util.Scanner;
public class reverselettertriangle {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no: ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=n-i;j>0;j--){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
