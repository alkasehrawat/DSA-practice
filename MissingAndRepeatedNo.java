//leetcode-2965
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] count=new int[n*n+1];//to find frequency
        int[] ans=new int[2];//to store repeated or missing no
        //cal freq in count arr
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                count[grid[i][j]]++;
            }
        }

        for(int i=1;i<count.length;i++){
            if(count[i]==2){//if repeated
                ans[0]=i;
            }else if(count[i]==0){//if missing
                ans[1]=i;
            }else{
                continue;
            }
        }
        return ans;
    }
}
