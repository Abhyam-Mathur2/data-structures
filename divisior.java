import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.list;

public class divisior{
    public static void main(String[] args2){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=ob.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
