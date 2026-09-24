import java.util.*;
public class inheritance1 {
    public static String removeDuplicates(String s){
        int index = 0;
        char[] charArray = s.toCharArray();
        int j;
        for(int i  = 0; j<i; i++){
            if(s.charAt(i) == s.charAt(j))
                break;
        }
        if( j== i){
            charArray[index++] = s.charAt(i);
        }
        return new String(charArray, 0, index);
        }
    public static void main(String[] args) {
        
    }
}
