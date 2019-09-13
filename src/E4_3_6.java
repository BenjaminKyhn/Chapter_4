import java.util.Scanner;

public class E4_3_6 {
        public static void main(String[] args) {
            char x = 'a';
            char y = 'c';
            System.out.println(++x);
            System.out.println(y++);
            System.out.println(x - y);

            //4.3.7
            System.out.println((char) (Math.random() * 26 + 'a')); // why + 'a' ?

            //4.3.8
            System.out.println('a' < 'b');
            System.out.println((int)'a');
            System.out.println((int)'b');
            System.out.println('a' <= 'A');
            System.out.println('a' > 'b');
            System.out.println('a' >= 'A');
            System.out.println('a' == 'a');
            System.out.println('a' != 'b');
        }
}
