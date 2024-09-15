public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Integer integerNumber = 100;
        Long longNumber = 10000L;
        Short shortNumber = 1000;
        Float floatNumber = 1000F;
        Double doubleNumber = 100.0;
        Byte byteNumber;
        Boolean bool = true;
        // System.out.println(byteNumber); Error
        byteNumber = 100;

        System.out.println(integerNumber);
        System.out.println(longNumber);
        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(bool);

        // convertion primitive to non-primitive
        int age = 10;
        Integer convertToNonPrimitive = age;
        int convertToPrimitive = convertToNonPrimitive.intValue();
        System.out.println("\nage : " + age);
        System.out.println("convert to non primitive : " + convertToPrimitive);
        System.out.println("convert to primitive : " + convertToPrimitive);
    }
}
