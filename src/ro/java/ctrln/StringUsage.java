package ro.java.ctrln;

public class StringUsage {

    public static void main(String[] args) {
        String stringOne = "This is Java!"; //acesta este un string literal
        String stringTwo = "This in Java!"; //acesta este tot un string literal
        String stringTree = new String("This is Java!"); //acest obiect este tinut pe heap nu in string pool
        String stringFor = new String(stringOne);

        System.out.println("stringOne.equals(stringTwo): " + stringOne.equals(stringTwo));
        System.out.println("stringOne == stringTwo: " + (stringOne == stringTwo));
        System.out.println("stringOne == stringTwo" + stringOne == stringTwo);

        System.out.println("stringOne.equals(stringTree): " + stringOne.equals(stringTree));
        System.out.println("stringOne == stringThree : " + (stringOne == stringTree));

        System.out.println("stringOne.equals(stringFor) : " + stringOne.equals(stringFor));
        System.out.println("stringOne == stringFor : " + (stringOne == stringFor));

        String stringFive = new String(stringOne.getBytes());
        System.out.println("stringOne.equals(stringFive) : " + stringOne.equals(stringFive));
        System.out.println("stringOne == stringFive : " + (stringOne == stringFive));

        String stringSix = "JAVA"; //acest string literal este internalizat pe string pool
        char[] chars = {'J','A','V','A'};
        String stringSeven = new String(chars); //acest string este tinut pe heap
        System.out.println("stringSix.equals(stringSeven) : " + stringSix.equals(stringSeven));
        System.out.println("stringSix == stringSeven : " + (stringSix == stringSeven));

        StringBuilder stringBuilder = new StringBuilder("JAVA");
        System.out.println("stringSix.equals(stringBuilder) : " + stringSix.equals(stringBuilder));
        System.out.println("stringSix.equals(stringBuilder.toString()) : " + stringSix.equals(stringBuilder.toString()));
        //System.out.println("stringSix == stringBuilder); //acest lucru nu este permis pt ca testam un obiect de tipul String si un obiect de tipul StringBuilder


    }
}
