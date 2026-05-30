public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {2,4,5,7,3,6};
        int target = 4;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}