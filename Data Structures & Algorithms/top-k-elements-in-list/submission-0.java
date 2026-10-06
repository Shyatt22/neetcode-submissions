class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsFreq=new HashMap<>();

        for(int num: nums){
            if(!numsFreq.containsKey(num)){
                numsFreq.put(num, 1);
            }
            else{
                numsFreq.put(num, numsFreq.get(num)+1);
            }
        }

        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer, Integer> entry: numsFreq.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] res=new int[k];
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[1];
        }
        return res;


        
        
    }
}
