import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if (strs==null || strs.length==0) {
            return new ArrayList<>();
        }

        Map<String,List<String>> m = new HashMap<>();
        for (String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String tempkey = String.valueOf(temp);
            if (!m.containsKey(tempkey)){
                m.put(tempkey, new ArrayList<>());
            }
            m.get(tempkey).add(s);
        }
        return new ArrayList<>(m.values());
    }


}
