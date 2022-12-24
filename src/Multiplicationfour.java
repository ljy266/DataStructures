import java.util.ArrayList;
import java.util.List;

public class Multiplicationfour {
    public List calculate(int[] array){
        List<Integer> result = new ArrayList<Integer>();
        if (array.length<4){return result;}
        int i=0;
        while((i+3)<array.length){
           int num = array[i]*array[i+1]*array[i+2]*array[i+3];
           result.add(num);
           i++;
        }
        return result;
    }
}
