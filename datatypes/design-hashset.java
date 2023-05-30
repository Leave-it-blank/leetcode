//https://leetcode.com/problems/design-hashset 

class MyHashSet {
    private static int MAX_BUCKET = 2000;
    private List<List<Integer>> buckets;

    public MyHashSet() {
        buckets = new ArrayList<>(MAX_BUCKET);
        for(int i=0; i< MAX_BUCKET; i++){
          buckets.add(new ArrayList<>());
        }
    }
    
    public void add(int key) {
        int hashValue = key % MAX_BUCKET;
        List<Integer> bucket = buckets.get(hashValue);
        if (!bucket.contains(key)) 
        {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int hashValue = key % MAX_BUCKET;
        List<Integer> bucket = buckets.get(hashValue);
        bucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int hashValue = key % MAX_BUCKET;
        List<Integer> bucket = buckets.get(hashValue);
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
