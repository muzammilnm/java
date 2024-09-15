public class PrimitiveDataType {
    public static void main(String[] args) {
        byte byteType = 100;
        //  byte byteType = 1000; this is error because maximum is 127 and minimum is -128
        System.out.println("byte : " + byteType);

        short shortType = 10000;
        //  byte shortType = 10000; this is error because maximum is 32,767 and minimum is -32,768
        System.out.println("short : " + shortType);

        int intType = 1000000000;
        //  byte intType = 10000000000; this is error because maximum is 2,147,483,647 and minimum is -2,147,483,648
        System.out.println("int : " + intType);

        long longType = 1000000000;
        long longType2 = 1000L;
        //  byte longType = 10000000000; this is error because maximum is 9,223,372,036,854,775,807 and minimum is 9,223,372,036,854,775,808
        System.out.println("long : " + longType);
        System.out.println("long2 : " + longType2);

        float floatType = 1000.12f;
        System.out.println("float : " + floatType);

        double doubleType = 201.10;
        System.out.println("double : " + doubleType);

        boolean boolTypeTrue = true;
        boolean boolTypeFalse = false;
        System.out.println("bool1 : " + boolTypeTrue);
        System.out.println("bool2 : " + boolTypeFalse);

        char charType = 'd';
        System.out.println("char : " + charType);

        // Literals
        int decimalInt = 50;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;
        System.out.println("\ndecimal int : " + decimalInt);
        System.out.println("hexa decimal : " + hexaDecimal);
        System.out.println("binary decimal : " + binaryDecimal);


        // Underscore
        int amount = 10_000_000;
        System.out.println("\namount underscore : " + amount); 
    }
}
