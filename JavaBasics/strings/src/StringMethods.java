import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //length()
        System.out.println("Java".length());

        //charAt(int index)
        System.out.println("Java".charAt(0));

        //substring(int start)
        System.out.println("Java".substring(1));

        //substring(int start, int end)
        System.out.println("Java".substring(1,3));

        //equals()
        System.out.println("Java".equals("Java"));

        //equalsIgnoreCase()
        System.out.println("Java".equalsIgnoreCase("java"));

        //contains()
        System.out.println("Java".contains("av"));

        //indexOf()/lastIndexOf()
        System.out.println("Java".indexOf('a'));
        System.out.println("Java".lastIndexOf('a'));

        //startsWith()/endsWith()
        System.out.println("Java".startsWith("Ja"));
        System.out.println("Java".endsWith("va"));

        //toCharArray()
        System.out.println(Arrays.toString("Java".toCharArray()));

        //split()
        System.out.println(Arrays.toString("a,b,c".split(",")));

        //replace()/replaceAll()
        String s = "banana";
        String s2 = s.replace('a', 'e');
        System.out.println(s2);

        String s3 = s.replaceAll("an", "en");
        System.out.println(s3);

        //trim()
        System.out.println("            hello         ".trim());

        //toLowerCase/toUpperCase()
        System.out.println("JAVA".toLowerCase());
        System.out.println("java".toUpperCase());

        //isEmpty()/isBlank()
        String s4 = "";
        String s5 = "                   ";

        System.out.println(s4.isEmpty());
        System.out.println(s5.isBlank());

    }
}
