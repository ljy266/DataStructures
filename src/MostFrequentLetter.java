import java.util.*;

public class MostFrequentLetter {
    public List<Object> mostFrequent(String s){
        List<Object> result = new ArrayList();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        if (s.length()==0 || s==null){
            return result;
        }
        char[] tempchar = s.toCharArray();
        for (int i=0 ;i<tempchar.length; i++){
            char temp = tempchar[i];
            Integer x = m.get(temp);
            if (x!=null){
                m.put(temp,x+1);
            }
            else{
                m.put(temp,1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> itr = m.entrySet().iterator();
        while(itr.hasNext()){
            Object o = itr.next();
            result.add(o);
        }
        return result;
    }
}
