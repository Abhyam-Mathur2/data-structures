import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=ob.nextInt();
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
            if(n/i!=i){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime no");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
