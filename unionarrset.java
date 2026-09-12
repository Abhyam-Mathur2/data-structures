import java.util.*;
public class unionarrset {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n=ob.nextInt();
        System.out.println("Enter the size of second array: ");
        int m=ob.nextInt();
        int [] arr=new int[n];
        int [] arr2=new int[m];
        System.out.println("Enter the element in first array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter the elements in second array:");
        for (int i = 0; i < m; i++) {
            arr2[i]=ob.nextInt();
        }
        Set<Integer> st=new HashSet<>();
        for(int num: arr){
            st.add(num);
        }
        for(int num: arr2){
            st.add(num);
        }
        System.out.println("Union of array is "+ new ArrayList<>(st));
    }
}
