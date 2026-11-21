class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor ==-1)
        {
            return Integer.MAX_VALUE;
        }
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int c=0;
        while(a>=b)
        {
            long temp=b;
            int p=1;
            while(a>=(temp<<1))
            {
                temp=temp<<1;
                p=p<<1;

            }
            a=a-temp;
            c=c+p;

        }
        if((dividend<0)!=(divisor<0))
        {
            c=-c;
        }
        return c;
    }
}