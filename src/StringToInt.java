public class StringToInt {
    public int myAtoi(String str) {
        int index = 0, sign = 1;
        if(str.length() == 0) return 0;

        while(index < str.length() && str.charAt(index) == ' ')
            index++;

        if(index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
//            System.out.println(sign);
        }

        if(index < str.length() && !Character.isDigit(str.charAt(index))) return 0;

        int result = 0;
        while(index < str.length()) {
            if(!Character.isDigit(str.charAt(index))) break;
            char current = str.charAt(index++);
            int previous = result;
            result *= 10;
            if(previous != result/10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result += (current - '0');
            System.out.println(result);
            if(result < 0) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return result * sign;
    }
}
