import java.util.Scanner;
public class evenoddwithoutmodolus {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no:");
        int num=ob.nextInt();
        oddoreven(num);
    }
    public static void oddoreven(int nums){
        int res=nums/2;
        if(res*2==nums){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
