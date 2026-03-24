/* Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 */
import java.util.Scanner;
public class Q1832 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = ob.nextLine();
        s=s.toLowerCase();
        if(pangram(s)){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
    public static boolean pangram(String s){
        boolean[] arr=new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']=true;
        }
        for(int j=0;j<26;j++){
            if(!arr[j]){
                return false;
            }
        }
        return true;
    }
}
