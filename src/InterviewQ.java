public class InterviewQ {

    public int findMin(int target, int[] array){
        int currsum = 0;
        int start=0;
        int end=0;
        int minLen = Integer.MAX_VALUE;

        while(start<array.length){
            if (currsum<target && end<array.length){
                currsum += array[end];
                end++;
            }
            else if (currsum>=target){
                minLen = Math.min(minLen, end-start);
                currsum -= array[start];
                start++;
            }
            else{
                break;
            }
        }
        return (minLen==Integer.MAX_VALUE) ? 0 : minLen;
    }
}
