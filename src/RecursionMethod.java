public class RecursionMethod {
    public static void main(String[] args) {
        System.out.println("faktorial 7 : " + factorial(7));
    }

    static int factorial(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorial(value-1);
        }
    }
}
