public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;
        var loop = 11;
        System.out.println("counter : " + counter);

        while (counter <= 10) {
            System.out.println("loop " + counter);
            counter++;
        }


        // do while
        System.out.println("\ndo while");
        do{
            System.out.println("loop : " + loop);
            loop++;
        }while(loop <=10);
    }
}
