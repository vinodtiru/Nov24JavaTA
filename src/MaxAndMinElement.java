import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMinElement {
    public static void main(String[] args){
        int[] inputArray ={1,2,3,4,5};
       ArrayList<Integer> inputArrayList= new ArrayList<>();
        for(int num:inputArray){
            inputArrayList.add(num);
        }
        int max = Collections.max(inputArrayList);
        int min =Collections.min(inputArrayList);

        System.out.println("Max num in th array :"+max);
        System.out.println("Min num in th array :"+min);



    }
}
