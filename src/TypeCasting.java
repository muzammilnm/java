public class TypeCasting {
    public static void main(String[] args) {
        // CAST NUMBER 
        // 1. Widening Cascting (automatically) - converting a smaller type to a larger type size byte -> short -> char -> int -> long -> float -> double
        byte byteNumber = 10;
        short shortNumber = 10;
        int intNumber = 10;
        long longNumber = 10L;
        float floatNumber = 10.0f;
        double doubleNumber = 10.0;
        System.out.println("byte : " + byteNumber);

        short byteToShort = byteNumber;
        int byteToInt = byteNumber;
        long byteToLong = byteNumber;
        float byteToFloat = byteNumber;
        double byteToDouble = byteNumber;
        System.out.println("\nbyte to short : " + byteToShort);
        System.out.println("byte to int : " + byteToInt);
        System.out.println("byte to long : " + byteToLong);
        System.out.println("byte to float : " + byteToFloat);
        System.out.println("byte to double : " + byteToDouble);

        int shortToInt = shortNumber;
        long shortToLong = shortNumber;
        float shortToFloat = shortNumber;
        double shortToDouble = shortNumber;
        System.out.println("\nshort to int : " + shortToInt);
        System.out.println("short to long : " + shortToLong);
        System.out.println("short to float : " + shortToFloat);
        System.out.println("short to double : " + shortToDouble);

        long intToLong = intNumber;
        float intToFloat = intNumber;
        double intToDouble = intNumber;
        System.out.println("\nint to long : " + intToLong);
        System.out.println("int to float : " + intToFloat);
        System.out.println("int to double : " + intToDouble);

        float longToFLoat = longNumber;
        double longToDouble = longNumber;
        System.out.println("\nlong to float : " + longToFLoat);
        System.out.println("long to double : " + longToDouble);

        float floatToDouble = floatNumber;
        System.out.println("\nfloat to double : " + floatToDouble);


        // 2. Narowing Casting (manually) - converting a larger type to a smaller size type double -> float -> long -> int -> char -> short -> byte
        float doubleToFloat = (float)doubleNumber;
        long doubleToLong = (long)doubleNumber;
        int doubleToInt = (int)doubleNumber;
        short doubleToShort = (short)doubleNumber;
        byte doubleToByte = (byte)doubleNumber;
        System.out.println("\n\ndouble to float : " + doubleToFloat);
        System.out.println("double to long : " + doubleToLong);
        System.out.println("double to int : " + doubleToInt);
        System.out.println("double to short : " + doubleToShort);
        System.out.println("double to byte : " + doubleToByte);

        long floatToLong = (long)floatNumber;
        int floatToInt = (int)floatNumber;
        short floatToShort = (short)floatNumber;
        byte floatToByte = (byte)floatNumber;
        System.out.println("\nfloat to long : " + floatToLong);
        System.out.println("float to int : " + floatToInt);
        System.out.println("float to short : " + floatToShort);
        System.out.println("float to byte : " + floatToByte);

        int longToInt = (int)longNumber;
        short longToShort = (short)longNumber;
        byte longToByte = (byte)longNumber;
        System.out.println("\nlong to int : " + longToInt);
        System.out.println("long to short : " + longToShort);
        System.out.println("long to byte : " + longToByte);

        short intToShort = (short)intNumber;
        byte intToByte = (byte)intNumber;
        System.out.println("\nint to short : " + intToShort);
        System.out.println("int to byte : " + intToByte);

        byte shortToByte = (byte)shortNumber;
        System.out.println("short to byte : " + shortToByte);
    }
}
