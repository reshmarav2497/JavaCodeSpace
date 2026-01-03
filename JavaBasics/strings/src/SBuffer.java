import java.util.Arrays;

public class SBuffer {
    public static void main(String[] args) {

        //String Buffer constructors

        //1)Default
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1-> " + sb1);

        //2)Set Initial Content
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("sb2 capacity-> " + sb2.capacity()); //capacity -> 16+5

        //3) Set Initial Size
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println("sb3 capacity-> " + sb3.capacity());

        //common methods

        //1) append()
        sb1.append("Hi Max");
        System.out.println("sb1-> " + sb1.capacity());

        //2) insert()
        sb1.insert(6, ", how are you?");
        System.out.println("sb1 -> " + sb1);

        //3) delete()
        sb1.delete(6, 8);
        System.out.println("sb1 -> " + sb1);

        //4) reverse()
        sb2.reverse();
        System.out.println("sb2 -> " + sb2);

        //5)charAt()//setCharAt()
        System.out.println("sb2[1] -> " + sb2.charAt(1));
        sb2.setCharAt(2, 'p');
        System.out.println("sb2 -> " + sb2 );

        sb3.append("test,test2,test3");
        System.out.println("sb3 -> " + sb3);

        //split
        String[] arr = sb3.toString().split(",");
        System.out.println("arr -> " + Arrays.toString(arr));

        //remove extra spaces
        StringBuffer sb4 = new StringBuffer("   hello          xyz");
        String res = sb4.toString().replaceAll("\\s+", "");
        System.out.println("res-> " + res);
    }
}
