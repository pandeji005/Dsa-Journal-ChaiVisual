class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1) return 1;
        int[] newdp = new int[n+1];
        newdp[0]=newdp[1]=1;
        for(int i=2;i<=n;i++) newdp[i]=newdp[i-1]+newdp[i-2];

        return newdp[n];
    }

}