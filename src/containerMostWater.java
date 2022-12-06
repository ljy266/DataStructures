public class containerMostWater {

    //brute force
    public int maxArea(int[] height){
        int max = 0;
        for (int i = 0; i < height.length; i++){
            for (int y = i+1; y < height.length; y++){
                int area  = (y-i) * Math.min(height[i],height[y]);
                max = Math.max(max,area);
            }
        }
        return max;
    }

    //better way O(n)
    public int maxArea2(int[] height){
        int i = 0;
        int y = height.length - 1;
        int max = 0;
        int area = (y-i) * Math.min(height[i],height[y]);
        max = Math.max(max,area);

        while(i<y){
            if (height[i]<height[y]){
                i++;
            }
            else{
                y--;
            }
            area = (y-i) * Math.min(height[i],height[y]);
            max = Math.max(max,area);
        }

        return max;
    }

}
