public class BreakContinue {
    public static void main(String[] args) {
        var counter = 1;
        var loop = 1;
        System.out.println("counter : " + counter + "\n");
        
        // break
        while(true){
            System.out.println("loop : " + counter);
            counter++;

            if(counter == 10){
                break;
            }
        }

        // continue
        System.out.println("\n");
        for(var i=1; i<=100; i++){
            if(i%2 == 0){
                continue;
            }

            System.out.println("number : " + i);
        }
    }
}
