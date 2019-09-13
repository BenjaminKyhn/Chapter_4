public class E4_4_5 {
    public static void main(String[] args) {
        String s1 = " Welcome ";
        String s2 = " welcome ";
        boolean isEqual = s1.equals(s2);
        int x = s1.compareTo(s2);
        boolean b = s1.startsWith("AAA");
        char y = s1.charAt(0);
        String s3 = s1 + s2;
        String s4 = s1.toLowerCase();
        String s5 = s1.toUpperCase();
        String s6 = s1.trim();
        int z = s1.indexOf('e');
        int w = s1.lastIndexOf("abc");

        System.out.println(isEqual);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(x);
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(b);
        System.out.println(s1.endsWith("AAA"));
        System.out.println(s1.length());
        System.out.println(y);
        System.out.println(s3);
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1, 4));
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(z);
        System.out.println(w);

        int i = 47113;
        double d = 234.684;
        System.out.println((i + "").length());
        System.out.println((d + "").length());

    }
}
