package ro.java.ctrln;

public class StringConcatenation {
    public static void main(String[] args) {
        String stringOne = "This is";
        String stringTwo = "JAVA!";
        String stringThree = stringOne + " " + stringTwo;
        System.out.println(stringThree);

        String stringFor = stringThree + 2;
        System.out.println(stringFor);

        String stringFive = 2 + stringThree;
        System.out.println(stringFive);

        String stringSix = stringThree + false; //false este transformat in "false"
        System.out.println(stringSix);

        String stringSeven = stringThree + null;
        System.out.println(stringSeven); //null este transformat in "null"

        String stringEight = stringThree + "null";
        System.out.println(stringEight);

        String stringNine = "" + true + 1; //""este empty string
        System.out.println(stringNine);

        String stringTen = "JAVA";
        stringTen += 1;
        stringTen = stringTen + 1;
        System.out.println(stringTen);


    }
}

