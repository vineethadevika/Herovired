class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int [n][n];
        int startrow=0;
        int endrow= n-1;
        int startcol=0;
        int endcol= n-1;
        int count=1;

        while(startrow<=endrow && startcol<=endcol){
            //adding top border elements
            for(int j=startcol; j<=endcol; j++){
                matrix[startrow][j] = count;
                count++;
            }
            //adding right border elements
            for(int i=startrow+1; i<=endrow; i++){
                matrix[i][endcol] = count;
                count++;
            }
            //adding bottom border elements
            for(int j=endcol-1; j>=startcol; j--){
                //to avoid editing same position twice
                if(startrow==endrow){
                    break;
                }
                matrix[endrow][j] = count;
                count++;
            }
            //adding left border elements
            for(int i=endrow-1; i>=startrow+1; i--){
                //to avoid editing same position twice
                if(startcol==endcol){
                    break;
                }
                matrix[i][startcol] = count;
                count++;
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        return matrix;
        
    }
}
