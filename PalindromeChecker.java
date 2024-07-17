public class PalindromeChecker {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println(checker.isPalindrome("Global"));
        System.out.println(checker.isPalindrome("race a car"));
        System.out.println(checker.isPalindrome("helololo"));
        System.out.println(checker.isPalindrome("lalalal"));
        System.out.println(checker.isPalindrome("Able was I, I saw Elba"));
    }
}
