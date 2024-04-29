package com.trinhtien2212;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) sb.append(s.charAt(i));
        }
        s = sb.toString();
        int first = 0;
        int last = s.length() - 1;
        while (last > first) {
            if (s.charAt(first++) != s.charAt(last--)) return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        int first = 0;
        int last = s.length() - 1;
        while (last > first) {
            char fchar = s.charAt(first);
            char lchar = s.charAt(last);
            if (!Character.isLetterOrDigit(fchar)) first++;
            else if (!Character.isLetterOrDigit(lchar) ) last--;
            else if (Character.toLowerCase(fchar) != Character.toLowerCase(lchar)) return false;
            else {
                first++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidPalindrome.isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println(ValidPalindrome.isPalindrome2("race a car"));
    }
}
