class Solution {
    int idx = 0;
    public boolean parseBoolExpr(String expression) {
        return evaluateBool(expression);
    }
    
    boolean evaluateBool(String exp) {
        char curr = exp.charAt(idx++);
        if(curr=='t') return true;
        if(curr=='f') return false;
        if(curr=='!') {
            idx++;
            boolean res = !evaluateBool(exp);
            idx++;
            return res;
        }
        ArrayList<Boolean> values = new ArrayList<>();
        idx++;
        while(exp.charAt(idx)!=')') {
            if(exp.charAt(idx)!=',') {
                values.add(evaluateBool(exp));
            }
            else {
                idx++;
            }
        }
        idx++;
        if(curr=='&') {
            for(Boolean v: values) if(!v) return false;
            return true;
        }
        if(curr=='|') {
            for(Boolean v: values) if(v) return true;
            return false;
        }
        return false;
    }
}

