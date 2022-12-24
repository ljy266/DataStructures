public class RomanToInt {

    public int romanToInt(String s) {
        int sum[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M':
                    sum[i]=1000;
                    break;
                case 'D':
                    sum[i] = 500;
                    break;
                case 'C':
                    sum[i] = 100;
                    break;
                case 'L':
                    sum[i] = 50;
                    break;
                case 'X':
                    sum[i] = 10;
                    break;
                case 'V':
                    sum[i] = 5;
                    break;
                case 'I':
                    sum[i] = 1;
                    break;
            }
        }

        int result = 0;
        for (int i=0; i<sum.length-1; i++){
            if (sum[i]<sum[i+1]){
                result = result - sum[i];
            }
            else {
                result += sum[i];
            }
        }
        return result + sum[sum.length-1];
    }
}
