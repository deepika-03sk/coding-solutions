class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if(n==1)
        return value;
        if(value==1)
        return -1;
        int p=value;
        for(int i=2;i*i<=value;i++)
        {
            if(value%i==0)
            {
                p=i;
                break;
            }
        }
            if(index>0 && value-p<2*index)
            return -1;
        int steps=n-1-index;
        if(steps==0)
        {
            return value;
        }
        return value+p+2*steps;
    }
}