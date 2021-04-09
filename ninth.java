/* Given a list (combination of repeated and distinct elements) and number of elements deletion X. You have to delete any X element from the list, so that the list will have
minimum distinct numbers */


/* The complete solution on my geeksforgeeks practise: https://practice.geeksforgeeks.org/problems/minimum-distinct-ids3251/1#     */


class Solution
{
    int distinctIds(int arr[], int n, int m)
    {
        Map<Integer,Integer> values=new HashMap<Integer,Integer>();
        int size=0, count=0;
        for(int i=0;i<n;i++){
           if(values.containsKey(arr[i])==false) {
                values.put(arr[i],1);
                size++;
           }
           else{
               values.put(arr[i],values.get(arr[i])+1);
           }
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(values.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()   
        {  
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)   
        {  
        return o1.getValue().compareTo(o2.getValue());
        }  
        });  
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();  
        for (Map.Entry<Integer, Integer> entry : list)   
        {  
        sortedMap.put(entry.getKey(), entry.getValue());  
        }  
        
        
        for (Map.Entry<Integer, Integer> value:sortedMap.entrySet()){
            if(m>=value.getValue()){
                m-=value.getValue();
                count++;
            }
            else return size - count;
            //System.out.println(value.getKey()+ "  "+value.getValue());
        }
        return size-count;
        
    }
}
