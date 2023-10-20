package Day30;

public class CodingBat {

    //Given an array of ints, return true if it contains a 2, 7, 1 pattern:
    // a value, followed by the value plus 5, followed by the value minus 1.
    // Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    //
    // [1,2,7,1,6,6,6,6] -> right pattern
    // value = 2
    // value + 5 = 7
    // value - 1 = 1

    // [1,2,3,4,5] -> wrong pattern
    // value = 1
    // value + 5
    // value - 1

    // [1,6,0,4,5] -> right pattern

    public static void main(String[] args) {
        int[] array = {2, 7, 5, 10, 4, 3, 2};
        System.out.println(has271(array));
        // 2 7 1
        // 7 1 4
        // 1 4 5
        // 4 5 2
    }



    // has271([2, 7, 1]) → perfect pattern
    // has271([2, 7, 2]) -> true ; differs by 1
    // has271([2, 7, 3]) -> true ; differs by 2
    // has271([2, 7, 0]) -> true ; differs by 1
    // has271([2, 7, -1]) -> true ; differs by 2
    // has271([2, 7, -2]) -> false ; differs by 3
    // has271([2, 7, 4]) -> false; differs by 3



    // has271([2, 7, 10, 15, 9]) -> perfect pattern
    // has271([2, 7, 10, 15, 8]) -> true, differs by 1
    // has271([2, 7, 10, 15, 7]) -> true, differs by 2
    // has271([2, 7, 10, 15, 10]) -> true, differs by 1
    // has271([2, 7, 10, 15, 11]) -> true, differs by 2

    // has271([2, 7, 10, 15, 6]) -> false, differs by 3





    public static boolean has271 (int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            int value = nums[i];
            int second = nums[i+1];
            int third = nums[i+2];
            if(second == value + 5 && (
                    third >= value - 3 && third <= value +1 )){
                return true;
            }
        }
        return false;
    }

}
