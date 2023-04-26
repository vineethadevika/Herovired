class Solution {
    public int trap(int[] height) {
        int sum = 0, maxHeightIndex = 0;
for (int i = 0; i <= height.length - 1; i++)
	if (height[i] >= sum) {
		sum = height[i];
		maxHeightIndex = i;
	}
sum = 0;
int k = height[0], l = height[height.length - 1], j = height.length;

for (int i = 0; i <= height.length; i++) {
	if (i <= maxHeightIndex) {
		if (k - height[i] > 0)
			sum += k - height[i];
		else k = height[i];
	} else {
		if (l - height[--j] > 0)
			sum += l - height[j];
		else l = height[j];
	}
}
return sum;
    }
}