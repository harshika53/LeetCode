class Solution {
    public String frequencySort(String s) {
     StringBuilder result = new StringBuilder();
     Map<Character, Integer> map = new HashMap<>();
     for(char ch:s.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0) +1);
     }   
      ArrayList <Character> list = new ArrayList<>(map.keySet());
      list.sort((a,b) -> map.get(b) - map.get(a));
      for( char ch :list){
        for(int i=0; i<map.get(ch); i++){
            result.append(ch);
        }
      }
      return result.toString();
    }
}