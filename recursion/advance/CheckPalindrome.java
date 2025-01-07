package advance;

public class CheckPalindrome {
    public static boolean isPalindrome(String str, int i) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length()- i -1)) {
            return false;
        }
        return isPalindrome(str, i + 1);
    }
    public static void main(String[] args) {
        String str = "amanaplanacanalpanama";
        if (isPalindrome(str, 0)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
