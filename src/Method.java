public class Method {
    public static void main(String[] args) {
        helloJohn();
        System.out.println("\n");

        helloName("Muzammil", "Indonesia");

        System.out.println("my age is " + myAge(1998));
    
        System.out.println("\nmax numbers : " + getMaxNumber(3,423,432,334,324,55,654,5));
    }

    static void helloJohn(){
        System.out.println("Hello John, good morning :)");
    }

    // method parameter
    static void helloName(String name, String address){
        System.out.println("Hello my name is " + name + ", iam from " + address);

    }

    // method return value
    static Integer myAge(Integer yearOfBirth){
        Integer currentYear = 2024;
        return currentYear - yearOfBirth;
    }

    // method variable argument
    static Integer getMaxNumber(int... numbers){
        Integer maxNumber = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        return maxNumber;
    }
}
