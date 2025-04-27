public class CountCharUsingRecursion {
    static int countChar(String str, char target) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == target) ? 1 : 0;
        return count + countChar(str.substring(1), target);
    }

    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';
        int count = countChar(str, target);
        System.out.println(count);
    }
}
