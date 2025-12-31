public class SB {
    public static void main(String[] args) {

        //StringBuilder for better performance
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++){
            char c = (char)('a'+ i);
            str.append(c);
        }

        System.out.println(str);

        StringBuilder str2 = new StringBuilder();

        //methods

        //append()
        str2.append("Pen");
        System.out.println(str2);

        //insert(ind, val)
        str2.insert(0, 'T');
        System.out.println(str2);

        //delete(start, end)
        str2.delete(1, 2);
        System.out.println(str2);

        //reverse()
        StringBuilder str3 = new StringBuilder("NAN");
        str3.reverse();
        System.out.println(str3);

        //charAt()
        System.out.println("str3[0] => " + str3.charAt(0));

        //setCharAt(index, val)
        str3.setCharAt(0, 'P');
        System.out.println(str3);

        //toString()
        System.out.println(str3.toString());
    }
}
