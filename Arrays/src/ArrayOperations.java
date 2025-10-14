import java.util.ArrayList;

public class ArrayOperations {
    public static void main(String[] args) {

        //Using ArrayList

        ArrayList<Integer> arr = new ArrayList<>();

        //1) use add method to insert element --> O(1)
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        //2) Insert at a particular index --> O(n)
        arr.add(1, 5);

        //3) remove element at a particular index --> O(n)
        arr.remove(1);

        //4) set an element at particular index --> O(1)
        arr.set(2, 5);

        //5) get an element at particular index --> O(1)
        System.out.println("element at index 3 is = " + arr.get(3));

        System.out.println("Size of the array -> " + arr.size());

        System.out.println("arr --> " + arr.toString());
    }
}
