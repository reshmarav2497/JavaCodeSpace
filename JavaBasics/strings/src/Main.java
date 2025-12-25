public class Main {
    public static void main(String[] args) {

        //1) String Literal(String Pool)
        String s1 = "Java";
        //String s2 = "Java";

        //2) using new Keyword(Heap memory)
        String s2 = new String("Java");

        System.out.println("s2 => " + s2);

        //Immutability
        s2 = "OOPS";

        System.out.println("s2 => " + s2);

        /*
        => Comparison
        1) == -> reference check
        2) equals() -> content check
         */
        System.out.println("s1 == s2 => " + (s1 == s2));

        System.out.println("s1.equals(s2) => " + s1.equals(s2));

    }
}
