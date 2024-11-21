import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num={45, 76, 34,89,76};
        Arrays.sort(num);
        int length=num.length-1;

        for(int i=length-1;i>=0;i--) {
            if (num[i] > num[i-1]) {
                System.out.println("Second largest number is " + num[i]);
                break;
            }
        }
    }
}
