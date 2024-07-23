import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 13, 1, 0};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            } else if (arr[i] > maxVal ) {
                maxVal = arr[i];
            }
        }
            System.out.println("Minimum Value is : " + minVal);
            System.out.println("Maximum Value is : " + maxVal);

    }
}
