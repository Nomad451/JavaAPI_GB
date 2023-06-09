package seminars.seminar2.homework;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbasfda"));
    }

    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseStr = String.valueOf(sb.reverse());
        if (str.equals(reverseStr)) {
            return true;
        }
        return false;
    }
}
