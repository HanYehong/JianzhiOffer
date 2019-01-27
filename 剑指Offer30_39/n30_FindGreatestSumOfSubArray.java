public class n30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if(len == 0) return 0;
        if(len == 1) return array[0];
        int sum = array[0];
        int max = sum;
        for(int i = 1; i < len; i++){
            if(sum < 0) sum = array[i];
            else sum += array[i];
            if(sum > max) max = sum;
        }
        return max;
    }
}
