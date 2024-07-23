public class Task8 {
    public static void main(String[] args) {

        String[] arr = {"The", "Cat", "In", "The", "Hat", };

        for (String str : arr){
            System.out.print(str + " ");
        }

        int middle = arr.length / 2;
        String index1 = arr[0];
        arr[0] = arr[middle];// changing middle element to first element
        arr[middle] = index1; // changing first element to middle element


        System.out.println();
        System.out.println();
        System.out.println("Swapped Array:");

        for (String str : arr){
            System.out.print(str + " ");
        }


    }
}
