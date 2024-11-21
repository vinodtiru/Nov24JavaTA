public class ReverseArray {
    public static void main(String[] args) {
        String[] animals={"cat", "dog", "bird", "fish"};
        String[] reversedArray= new String[animals.length];
        int lastIndex= animals.length-1;
        for(int i=0;i<animals.length;i++){
            reversedArray[i]=animals[lastIndex];
            lastIndex--;
        }
        for(String reversedElements:reversedArray){
            System.out.println(reversedElements);
        }


    }
}
