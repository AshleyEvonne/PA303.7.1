public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;

            if (i == 2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
