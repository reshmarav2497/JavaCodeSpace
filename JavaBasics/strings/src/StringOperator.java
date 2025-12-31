public class StringOperator {
    public static void main(String[] args) {

        String a = "ab";
        String b = "bc";
        String s = "s";
        char d = 'd';
        char e = 'e';

        // + Operator -> string + string
        System.out.println("string + string => " + a + b);

        // + Operator -> string + char
        System.out.println("string + char => " + a + d);

        // + Operator -> char + char
        System.out.println(d+e);

        //append string before concatenating characters
        System.out.println("char + char => " + d + e);

        // + Operator -> string + number
        // Use bodmas
        System.out.println("string + number => " + (10 + 20));

        // += Operator
        //creates new object every time we append new string
        s += "u";
        s += "n";
        System.out.println("+= operator => " + s);

    }
}
