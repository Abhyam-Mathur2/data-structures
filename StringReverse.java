public class StringReverse {
    public static void main(String[] args) {
        String s = " i like this program very much ";
        char[] arr = s.toCharArray();
        int n = arr.length;
        String[] words = new String[n];
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == ' ') continue;
            int j = i;
            for (; i >= 0 && arr[i] != ' '; i--);
            String word = s.substring(i + 1, j + 1);
            words[index++] = word;
        }
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < index; k++) {
            result.append(words[k]);
            if (k != index - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}