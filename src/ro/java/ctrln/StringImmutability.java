package ro.java.ctrln;

public class StringImmutability {

    public static void main(String[] args) {

        String stringOne = "wxyz";
        String stringTwo = new String("wxyz");
        String stringThree = stringOne.toUpperCase();
        String stringFour = stringTwo.toUpperCase();
        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
        System.out.println(stringFour);
        System.out.println(stringOne.toUpperCase());
        System.out.println(stringTwo.toUpperCase());

        String stringFive = "   1234    ";
        stringFive.trim();
        System.out.println(stringFive);
        System.out.println(stringFive.trim());

        stringOne = "This is Java language!";
        System.out.println(stringOne.substring(2));
        System.out.println(stringOne.substring(5,9));

        System.out.println(stringOne.replace('i', 'z'));
        System.out.println(stringOne.replace("is", "as"));
        System.out.println(stringOne.charAt(9));
        System.out.println(stringOne.concat(stringTwo));
        System.out.println(stringOne);
        System.out.println(stringOne.indexOf('a'));
        System.out.println(stringOne.length());
        System.out.println(stringOne.startsWith("Th"));
        System.out.println(stringOne.endsWith("?"));
    }
}
