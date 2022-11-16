import java.util.Arrays;

public class PostIncrement {
    public static void main(String[] args) {
        int[] array = new int[20];
        int y = 0;
        for(int i = 0; i < 2;i++){
            array[++y] = 100;
            System.out.println(y);
        }
        System.out.println(Arrays.toString(array));

    }
}
