public class StringFormatting {
    public static void main(String[] args) {

        //String Formatting/Pretty Printing
        int a = 10;
        float pi = 3.14159f;
        String s = "Java";
        char c = 'A';

        //using Printf()

        //integers -> %d
        System.out.printf("%d %n", a);

        //floating point nums -> %f
        System.out.printf("%f default %n", pi);

        System.out.printf("%.2f limit the nums after decimal point %n", pi);

        //string -> %s
        System.out.printf("%s %n", s);

        //character -> %c
        System.out.printf("%c %n", c);

        //left align -> %-
        System.out.printf("|%-6d| %n", a);

        //right align
        System.out.printf("|%6d| %n", a);

        //zero padding -> 0%
        System.out.printf("|%06d| %n", a);

        //Printing multiple values
        String name = "Alex";
        int age = 30;

        System.out.printf("%s is %d years old %n", name, age);

        //using string.format()
        String msg = String.format("%s is %d years old", name, age);
        System.out.println(msg);

    }

}
