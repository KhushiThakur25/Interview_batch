class ReverseString_recursion {
    static String reverse(String st) {
        if (st.isEmpty()) {
            return st;
        }
        return reverse(st.substring(1)) + st.charAt(0);
    }

    public static void main(String[] args) {
        String st = "Hellouigfeurd";
        // String result = reverse(st);
        // System.out.println("Your reverse string is:" + result);
        System.out.println(st.substring(3));
    }

}