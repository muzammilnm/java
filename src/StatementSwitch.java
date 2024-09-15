public class StatementSwitch {
    public static void main(String[] args) {
        var johnGrade = "A";
        var doeGrade = "C";
        var muzammilGrade = "D";
        System.out.println("grade john : " + johnGrade);
        System.out.println("grade dow : " + doeGrade);

        // switch
        switch (johnGrade) {
            case "A":
                System.out.println("grade John is Excellent");
                break;
            case "B":
                System.out.println("grade John is Good");
                break;
            case "C":
                System.out.println("grade John is Average");
                break;
            default:
                System.out.println("grade John is Barely Passing");
                break;
        }


        // switch lambda
        switch(doeGrade){
            case "A" -> System.out.println("grade Doe is Excellent");
            case "B" -> System.out.println("grade Doe is Good");
            case "C" -> System.out.println("grade Doe is Average");
            default -> {
                System.out.println("grade Doe is Barely Passing");
            }
        }

        // swith with yield
        String statement = switch(muzammilGrade){
            case "A" : yield "grade Muzammil is Excellent";
            case "B" : yield "grade Muzammil is Good";
            case "C" : yield "grade Muzammil is Average";
            default :
                yield "grade Muzammil is Barely Passing";
        };
        System.out.println(statement);
    }
}
