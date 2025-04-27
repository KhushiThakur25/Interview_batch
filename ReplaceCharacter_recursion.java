public class ReplaceCharacter_recursion {
    static String replaceString(String str,char oldChar,char newChar){
        if(str.isEmpty()){
            return str;
        }
        char ch = str.charAt(0);
        if(ch == oldChar){
            ch = newChar;
        }
        return ch + replaceString(str.substring(1), oldChar, newChar);
    }
    public static void main(String[] args) {
        String st = "banana";
        char oldChar = 'a';
        char newChar = 'x';
        replaceString(st, oldChar, newChar);
    }
}
