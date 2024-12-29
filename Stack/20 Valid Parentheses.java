class Solution {
    public boolean isValid(String s) {
        String[] sp = s.split("");
        if(sp.length==0 || sp.length==1){
            return false;
        }
        String trace = sp[0];
        for(int i=1;i<sp.length;i++){
            if(sp[i].equals("(")||sp[i].equals("{")||sp[i].equals("[")){
                // left 
                trace = trace.concat(sp[i]);
            }else if(trace.length()>=1&&trace.substring(trace.length()-1).equals("(")&&sp[i].equals(")")){
                trace = trace.concat(sp[i]);
                trace = trace.substring(0,trace.length()-2);
            }else if(trace.length()>=1&&trace.substring(trace.length()-1).equals("{")&&sp[i].equals("}")){
                trace = trace.concat(sp[i]);
                trace = trace.substring(0,trace.length()-2);
            }else if(trace.length()>=1&&trace.substring(trace.length()-1).equals("[")&&sp[i].equals("]")){
                trace = trace.concat(sp[i]);
                trace = trace.substring(0,trace.length()-2);
            }else{
                return false;
            }
        }
        if(trace.length()==0){
            return true;
        }else{
            return false;
        }
    }
}