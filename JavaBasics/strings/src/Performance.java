public class Performance {
    public static void main(String[] args) {

        //Using string in loops creates new object every time
        //wastage of memory

        String s = "";
        for (int i = 0; i < 26; i++){
            char c = (char)('a'+ i);
            s += c;
        }

        System.out.println(s);

        /*
        Use string builder for better performance
         */
    }
}
