public class StatementIf {
    public static void main(String[] args) {
        var a = 10;
        var b = 30;
        var c = 30;
        System.out.println("a : " + a);
        System.out.println("b : " + b );

        // if statement
        System.out.println("\nif statement");
        if(b > a){
            System.out.println("b > a");
        }

        // else statement
        System.out.println("\nelse statement");
        if(a == b){
            System.out.println("a == b");
        }else{
            System.out.println("\na != b");
        }

        // else if statement
        System.out.println("\nelse if statement");
        if(a == b){
            System.out.println("a = b");
        }else if(b == c){
            System.out.println("b == c");
        }else{
            System.out.println("other condition");
        }
    }
}
