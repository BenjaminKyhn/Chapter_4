public class E4_3_1 {
    public static void main(String[] args) {
        //4.3.1
        System.out.println("ASCII code for '1' is "+ (int)'1');
        System.out.println("ASCII code for 'A' is "+ (int)'A');
        System.out.println("ASCII code for 'B' is "+ (int)'B');
        System.out.println("ASCII code for 'a' is "+ (int)'a');
        System.out.println("ASCII code for 'b' is "+ (int)'b');

        System.out.println("Character for decimal code 40 is "+ (char)40);
        System.out.println("Character for decimal code 59 is "+ (char)59);
        System.out.println("Character for decimal code 79 is "+ (char)79);
        System.out.println("Character for decimal code 85 is "+ (char)85);
        System.out.println("Character for decimal code 90 is "+ (char)90);

        System.out.println("Character for hexadecimal code 40 is " + (char)0X40); //method #1
        System.out.println("Character for hexadecimal code 5A is " + '\u005A'); //method #2
        System.out.println("Character for hexadecimal code 71 is " + (char)0X71);
        System.out.println("Character for hexadecimal code 72 is " + (char)0X72);
        System.out.println("Character for hexadecimal code 7A is " + (char)0X7A);

        //4.3.4
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(c);



    }
}
