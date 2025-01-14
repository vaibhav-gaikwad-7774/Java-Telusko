package DSA;

public class LinearSearchTest {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 5, 6 };
        int target = 6;

        int result = linearSearch(nums, target);

        if (result != -1){
            System.out.println("Element found at index : "+ result);
        }else{
            System.out.println("Element is not found");
        }

            }
        
            public static int linearSearch(int[] nums, int target) {
                for(int i = 0; i<nums.length; i++){
                    if(nums[i] == target)
                    return i;
                }            
                
                return -1;
                
                
            }
}
        