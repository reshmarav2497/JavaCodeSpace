import java.util.ArrayList;
import java.util.Scanner;

public class PossibleWordsPhoneDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        ArrayList<String> res = new ArrayList<>();
        String[] padMap = {"",    "",    "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder prefix = new StringBuilder();
        possibleWordsRec(arr, 0, prefix, padMap, res);
        System.out.println(res);

    }

    public static void possibleWordsRec(int[] arr, int index, StringBuilder prefix,
                                 String[] padMap, ArrayList<String> res) {
        // Base case: if the prefix length matches arr size
        if (index == arr.length) {
            res.add(prefix.toString());
            return;
        }

        // Get the corresponding digit
        int digit = arr[index];

        // Skip invalid digits
        if (digit < 2 || digit > 9) {
            possibleWordsRec(arr, index + 1, prefix, padMap, res);
            return;
        }

        // Place all possible letters for this digit
        for (char ch : padMap[digit].toCharArray()) {
            prefix.append(ch);
            possibleWordsRec(arr, index + 1, prefix, padMap, res);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    //Time Complexity --> O(4^n)
    //Space Complexity --> O(n)
}
