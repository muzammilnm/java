public class Array {
    public static void main(String[] args) {
        String[] names;
        names = new String[3];
        names[0] = "muzammil";
        names[1] = "john";
        names[2] = "doe";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // array initializer
        int[] numbers = new int[]{
            10,20,30,40,50
        };

        long[] longs = {
            10,20,30,40,50
        };

        // lengt array
        System.out.println(numbers.length);

        // array in array
        String[][] members = {
            {"muzammil", "nm"},
            {"john", "doe"}
        };

        System.out.println("\n\nname1 : "+ members[0][0] + " "+members[0][1]);
        System.out.println("name2 : "+ members[1][0] + " "+members[1][1]);
    }
}
