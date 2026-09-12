import java.util.*;
public class unionarray {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n=ob.nextInt();
        System.out.println("Enter the size of second array: ");
        int m= ob.nextInt();
        int [] arr=new int[n];
        int [] arr2=new int[m];
        System.out.println("Enter the elements in first array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=ob.nextInt();
        }
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n && j<m){
            if(arr[i]<arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr[i]){
                    list.add(arr[i]);
                }
                i++;
            } else if (arr2[j]<arr[i]) {
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
            else{
                if(list.size()==0|| list.get(list.size()-1)!=arr[i]){
                    list.add(arr[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(list.size()== 0 || list.get(list.size()-1)!=arr[i]){
                list.add(arr[i]);
            }
            i++;
        }
        while(j<m){
            if(list.size()==0 || list.get(list.size()-1)!= arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println("union of array is "+ list);
    }
}
