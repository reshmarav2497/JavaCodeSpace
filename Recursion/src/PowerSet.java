import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with unique chars : ");
        String str = sc.nextLine();
        sc.close();

        ArrayList<String> list = new ArrayList<>();
        powerSet(str, 0, "", list);
        System.out.println(list);
    }

    public static void powerSet(String str, int i, String curr, ArrayList<String> li) {
        int n = str.length();
        if(i == n){
            li.add(curr);
            return;
        }

        powerSet(str, i + 1, curr + str.charAt(i), li);
        powerSet(str, i + 1, curr, li);
    }

    //Time Complexity --> O(2^n)
    //Space Complexity --> O(n)
}
