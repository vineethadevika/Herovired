class Solution {
    public void nextPermutation(int[] nums) {
    int n = nums.length ;
    int idx = -1 ;
    for(int i = n-1 ;i>=0 ;i--){
        if(i==0 ||nums[i-1]<nums[i]){
            idx = i ;
            break ;
        }
    }
    if(idx == 0){
       Reverse(nums,0,n-1);
       return ; 
    }else{
        int pivot = nums[idx-1];
        for(int i= n-1 ;i>=idx ;i--){
            int elem = nums[i];
            if(elem >pivot){
                int temp = nums[idx-1] ;
                nums[idx-1]= elem ;
                nums[i] = temp;
                Reverse(nums,idx,n-1);
                return;
            }
        }
    }
}
 
public void Reverse(int [] nums , int s , int e){
    while(s<e){
        int temp = nums[s];
        nums[s++]= nums[e];
        nums[e--]= temp ;
    }
}
}