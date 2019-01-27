import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class n29_GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        if(k > input.length) return new ArrayList();
//        Arrays.sort(input);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i = 0; i < k; i++){
//            arrayList.add(input[i]);
//        }
//        return arrayList;

        //构造大顶堆
        int len = input.length;
        if(k > input.length) return new ArrayList();
        if(k == 0) return new ArrayList<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < len; i++){
            if(priorityQueue.size() < k) priorityQueue.offer(input[i]);
            else{
                if(priorityQueue.peek() > input[i]){
                    priorityQueue.poll();
                    priorityQueue.offer(input[i]);
                }
            }
        }

        for (Integer i: priorityQueue
             ) {
            arrayList.add(i);
        }
        return arrayList;
    }

}
