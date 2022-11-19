public class ZipzagConvert {
    public String convert(String s, int nRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
//        int count = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
            {sb[idx].append(c[i]);
//                System.out.println("idx: " + idx);
//                System.out.println("i: " + i);
                i++;
            }

            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
            {sb[idx].append(c[i]); i++;}
//            count++;
//            System.out.println(count);
        }

        for (int idx = 1; idx < sb.length; idx++) {
            sb[0].append(sb[idx]);
//            System.out.println(sb[idx]);
        }
        //System.out.println(sb.length);
        return sb[0].toString();
    }
}
