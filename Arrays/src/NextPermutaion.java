/*
import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {

        int idx=-1;

        for(int i= nums.length-1; i>0; i--)
        {
            if(nums[i] > nums[i-1])
            {
                idx=i;
                break;
            }
        }

        if(idx == -1)
        {
            reverse(nums,0,nums.length-1);
        }
        else
        {
            int prev=idx;

            for(int i=idx+1; i<nums.length;i++)
            {
                if(nums[i] <= nums[prev] && nums[i] > nums[idx-1])
                {
                    prev=i;
                }
            }

            //swap
            int temp=nums[prev];
            nums[prev]=nums[idx-1];
            nums[idx-1]=temp;

            reverse(nums,idx,nums.length-1);
        }

    }

    public void reverse(int [] arr,int start, int end)
    {
        while(start < end)
        {
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}*/
