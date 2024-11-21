import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String[] names={"apple","banana", "apple", "cherry"};
        HashMap<String,Integer> findDuplicate = new HashMap<>();
        for (int i = 0; i <names.length ; i++) {
            if(!findDuplicate.containsKey(names[i])){
                findDuplicate.put(names[i],1);
            }
            else{

                findDuplicate.put(names[i],findDuplicate.get(names[i])+1);
            }
        }
        for(Map.Entry<String,Integer> duplicate:findDuplicate.entrySet()){
            if(duplicate.getValue()>1){
                System.out.println(duplicate.getKey());
            }
        }
    }
}
