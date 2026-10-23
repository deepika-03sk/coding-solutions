public static String solve(int N, int X, int[] A) {
    int flag=0;
    for(int i=0;i<N;i++)
    {
        if(A[i]==X)
        {
            flag=1;
            break;
        }
}
if(flag==1)
{
   return "YES";
}
else{
    return "NO";
}

}