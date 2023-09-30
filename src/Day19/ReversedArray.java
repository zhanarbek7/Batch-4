package Day19;

public class ReversedArray {
    public static void main(String[] args) {
        int [] array = {1, 99, 0, -5, 12, 543, -123, 234, 98};
        for(int i = array.length - 1 ; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }
}
