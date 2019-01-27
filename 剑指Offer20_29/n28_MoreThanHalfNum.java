import java.util.HashMap;

public class n28_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int len = array.length;
        for(int i = 0; i < len; i++){
            if(hashMap.get(array[i]) == null){
                hashMap.put(array[i],1);
                if(hashMap.get(array[i]) >= len/2+1) return array[i];
            }
            else{
                hashMap.put(array[i],hashMap.get(array[i])+1);
                if(hashMap.get(array[i]) >= len/2+1) return array[i];
            }
        }
        return 0;
    }
}
