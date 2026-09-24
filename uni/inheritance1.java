import java.util.*;
public class inheritance1 {
    public static String removeDuplicates(String s){
        int index = 0;
        char[] charArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            int j;
            for(j = 0; j < i; j++){
                if(s.charAt(i) == s.charAt(j))
                    break;
            }
            if(j == i)
                charArray[index++] = s.charAt(i);
        }
        return new String(charArray, 0, index);
    }
    public static void main(String[] args) {
        
    }
}
