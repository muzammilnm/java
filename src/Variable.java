public class Variable {
    public static void main(String[] args) {
        String name;
        String myFriend;
        int myNumber;
  
        name = "muzammil";
        myFriend = "john";
        myNumber = 123;

        System.out.println("\nname : " + name);
        System.out.println("myFriend : " + myFriend);
        System.out.println("myNumber : " + myNumber);

        var firstName = "Muzammil";
        var lastName = "nm";
        // var age; Error
        System.out.println("\nfirstName : " + firstName);
        System.out.println("lastName : " + lastName);


        final String gender = "male";
        // gender = "female"; Error
        System.out.println("\ngender : " + gender);
    }
}
