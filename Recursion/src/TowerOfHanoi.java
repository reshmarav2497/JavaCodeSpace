import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Discs : ");
        int n = sc.nextInt();
        sc.close();

        tOH(n, 'A', 'C', 'B');
        System.out.println(n + " Discs require " + tOHCount(n, 'A', 'C', 'B') + " moves.");
    }

    public static void tOH(int n, char from, char to, char aux){
        if(n == 1){
            System.out.println("Move 1 from " + from + " to " + to);
            return;
        }

        tOH(n-1, from, aux, to);
        System.out.println("Move " + n + " from " + from + " to " + to);
        tOH(n-1, aux, to, from);
    }

    public static int tOHCount(int n, char from, char to, char aux){

        int moves = 0;
        if(n>=1){
            moves += tOHCount(n-1, from, aux, to);
            moves++;
            moves += tOHCount(n-1, aux, to, from);
        }
        return moves;

        //OR
        //return (int)Math.pow(2,n) - 1;
    }

    //Time Complexity --> O(2^n)
    //Space Complexity --> O(n)
}