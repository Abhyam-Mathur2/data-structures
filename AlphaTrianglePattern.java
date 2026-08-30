import java.util.Scanner;
public class AlphaTrianglePattern {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n=ob.nextInt();
        for (int i = 0; i < n; i++) {
            for(char c=(char)('A'+n-i-1);c<=(char)('A'+n-1);c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
