public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;
        System.out.println("counter : " + counter);
        
        // for(;;){
        //     System.out.println("endless loop");
        // }

        // loop with condition
        for(; counter <= 10;){
            System.out.println("loop : " + counter);
            counter++;
        }

        // loop with init statement
        System.out.println("\n");
        for(var number=1; number <= 10; number++){
            System.out.println("loop : " + number);
        }
    }
}
