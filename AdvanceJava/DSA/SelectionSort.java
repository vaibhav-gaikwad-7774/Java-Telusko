package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {3,7,3,1,5,7,8};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for(int i = 0; i<size-1; i++){
            minIndex  = i;
            for (int j = i; j<size; j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
             nums[minIndex]= nums[i];
             nums[i] = temp ;
             }

        
        

        System.out.println();
        System.out.println("after Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        

    }
}