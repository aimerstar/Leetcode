// stack
class Solution {
    public boolean isValid(String s) {
        Stack trace = new Stack();
        for(char c : s.toCharArray()){
            // 直接先考慮右括號
            if(c=='}'){
                if(trace.isEmpty()||!trace.pop().equals('{')){
                    return false;
                }
            }else if(c==']'){
                if(trace.isEmpty()||!trace.pop().equals('[')){
                    return false;
                }
            }else if(c==')'){
                if(trace.isEmpty()||!trace.pop().equals('(')){
                    return false;
                }
            }else{
                trace.push(c);
            }
        }
        return trace.isEmpty();
    }
}