import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid string");
        String s = sc.nextLine();

        System.out.println("The given string " + s + (isPalindrome(s) ? " is " : " is not ") + "Palindrome");

        sc.close();
    }

    public static boolean isPalindrome(String str){
        if(str == null || str.isBlank()) return false;

        String s = str.toLowerCase();

        for(int i = 0; i < s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if(start != end) return false;
        }

        return true;
    }
}
