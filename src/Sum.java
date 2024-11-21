public class Sum {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 10};

        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        System.out.println("Sum of array : " + sum);

    }


    }
