class Solution {
    public String multiply(String num1, String num2) {
          int n = num1.length();
        int m = num2.length();
        
        int[] res = new int[n + m];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                
                int mul = a * b + res[i + j + 1];
                
                res[i + j + 1] = mul % 10;
                res[i + j] += mul / 10;
            }
        }
        
        String ans = "";
        
        for(int i = 0; i < res.length; i++) {
            if(ans.length() == 0 && res[i] == 0) {
                continue;
            }
            ans += res[i];
        }
        
        if(ans.length() == 0) {
            return "0";
        }
        
        return ans;
    
    }
}