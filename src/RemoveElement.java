import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e'};
        char removeAlphabet='c';
        ArrayList<Character> finalArray = new ArrayList<>();
        for(int i=0;i<alphabets.length;i++){
            if(alphabets[i]=='c')
            {continue;}
            else{
                finalArray.add(alphabets[i]);
            }

        }



        System.out.println(finalArray);
    }
}
