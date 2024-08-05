package MoveZeroes_283_easy;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {4,2,4,0,0,3,0,5,1,0};
        solution.moveZeroes(nums);
        System.out.println(nums);
    }
}
