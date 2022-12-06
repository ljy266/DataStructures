public class Main {
    public static void main(String[] args) {
//        ZipzagConvert test = new ZipzagConvert();
//        String answer = test.convert("PAYPALISHIRING",3);
//        System.out.println("String: PAYPALISHIRING, row number:3  ");
//        System.out.println(answer);

//        CharandInt test = new CharandInt();
//        int answer = test.method();
//        System.out.println(answer);

        containerMostWater test = new containerMostWater();
        int result = test.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(result);
    }
}
