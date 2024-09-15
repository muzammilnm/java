public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = 50;
        int d = 70;
        int e = 80;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("e : " + e);

        // Aritmetic Operator
        // Arithmetic operators are used to perform common mathematical operations.
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("\na addition b : " + addition);
        System.out.println("a subtraction b : " + subtraction);
        System.out.println("a multiplication b : " + multiplication);
        System.out.println("a division b : " + division);
        System.out.println("a modulus b : " + modulus);



        // Augmented Assigments
        c += 10;
        System.out.println("\nc += 10 : " + c);
        c -= 20;
        System.out.println("c -= 20 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 2;
        System.out.println("c /= 2 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);
        c &= 2;
        System.out.println("c &= 2 : " + c);


        // Unary Operator
        d++;
        System.out.println("\nd++ : " + d);
        d--;
        System.out.println("d-- : " + d);


        // Comparison Operator
        System.out.println("\na > b : " + (a>b));
        System.out.println("a < b : " + (a<b));
        System.out.println("a >= b : " + (a>=b));
        System.out.println("a <= b : " + (a<=b));
        System.out.println("a == b : " + (a==b));
        System.out.println("a != b : " + (a!=b));


        // Logical Operator
        boolean and = (e>b) && (e<a);
        boolean or = (d>e) || (c<d);
        boolean not = !true;
        System.out.println("(e>b) && (e<a) : " + and);
        System.out.println("(d>e) || (c<d) : " + or);
        System.out.println("!true : " + not);
    }
}
