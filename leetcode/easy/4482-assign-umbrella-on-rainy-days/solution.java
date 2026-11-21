class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[] ans=new String[n];
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {
            boolean alice = i<n-1 && rain[i]==1 && rain[i+1]==1;
            boolean bob=rain[i]==1;
            if(alice && bob)
            {
                if(a<=b)
                {
                    ans[i]="Alice";
                    a++;
                }
                else
                {
                    ans[i]="Bob";
                    b++;
                }
                
            }
            else if(alice)
            {
                ans[i]="Alice";
                a++;
            }
            else if(bob)
            {
                ans[i]="Bob";
                b++;
            }
            else
            {
                ans[i]="None";
            }
        }
        return ans;
    }
}