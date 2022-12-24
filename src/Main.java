import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ZipzagConvert test = new ZipzagConvert();
//        String answer = test.convert("PAYPALISHIRING",3);
//        System.out.println("String: PAYPALISHIRING, row number:3  ");
//        System.out.println(answer);

//        CharandInt test = new CharandInt();
//        int answer = test.method();
//        System.out.println(answer);

//        Multiplicationfour test = new Multiplicationfour();
//        List answer = test.calculate(new int[] {2,2,3,111,5,1,2,3,4});
//        System.out.println(answer);

//        CheckParentheses test = new CheckParentheses();
//        test.calculate("3 / {1 + [(1 + 1) * 1]}");

        InterviewQ test = new InterviewQ();
        int result = test.findMin(4, new int[] {1,4,4});
        System.out.println(result);

    }
}
