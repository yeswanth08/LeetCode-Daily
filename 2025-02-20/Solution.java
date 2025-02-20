import java.util.*;
class Solution {
    private HashSet<String> set = new HashSet<>();
    private boolean generate(StringBuilder st,int n){
        if (st.length()==n){
            if (!set.contains(st.toString())) return true;
            return false;
        }
        for (char i='0'; i<'2'; ++i){
            st.append(i);
            if (generate(st,n)) return true;
            st.deleteCharAt(st.length()-1);
        }return false;
    }
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        for (String i: nums) this.set.add(i);
        StringBuilder st = new StringBuilder("");
        generate(st,n);
        return st.toString();
    }
}