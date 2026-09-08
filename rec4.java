import java.util.*;
public class rec4 {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a=ob.nextInt();
        int ans=fact(a);
        System.out.println(ans);
    }
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        return a*fact(a-1);
    }
}
