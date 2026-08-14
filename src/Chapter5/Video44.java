package Chapter5;

public class Video44 {
    public static void main(String[] args) {
        String name = " Tran Trong Nghia (Victor) ";
        System.out.println("Original name: '" + name + "'");
        System.out.println("==========================");
        System.out.println("* length: " + name.length());
        System.out.println("* charAt(8): " + name.charAt(8));
        System.out.println("* substring: " + name.substring(6, 11));
        System.out.println("* indexOf: " + name.indexOf("Victor"));
        System.out.println("* trim(): '" + name.trim() + "'");
        System.out.println("* toUpperCase(): " + name.toUpperCase());
        System.out.println("* toLowerCase(): " + name.toLowerCase());
        System.out.println("* contains('trong'): " + name.contains("trong"));
        System.out.println("* concat([Voi]): " + name.concat("[Voi]"));
    }
}
