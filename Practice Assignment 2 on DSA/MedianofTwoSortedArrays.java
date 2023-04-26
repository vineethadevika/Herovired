class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        double res[]=new double[n1+n2];
        for(int i=0;i<n1;i++)
        {
            res[i]=nums1[i];
        }
        for(int i=n1,j=0;i<n1+n2;i++,j++)
        {
            res[i]=nums2[j];
        }
        Arrays.sort(res);
        int l=res.length;
        if(l%2!=0)
        return res[(l/2)];
        else
        return (res[(l/2)]+res[(l/2)-1]) / 2;
    }
}