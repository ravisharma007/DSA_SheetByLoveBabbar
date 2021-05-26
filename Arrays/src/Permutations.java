/*
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        if(nums == null || nums.length==0)
            return new ArrayList<>();

        List<List<Integer>> final2DResultList = new ArrayList<>();
        //boolean default value is = false;
        backtrackPermutation(nums,final2DResultList,new ArrayList<>(),new boolean[nums.length]);

        return final2DResultList;
    }

    public void backtrackPermutation(int [] nums, List<List<Integer>> finalResult, List<Integer> currList,boolean [] used)
    {
        if(currList.size() == nums.length)
        {
            finalResult.add(new ArrayList<>(currList));
            return;
        }
        else
        {
            for(int i=0; i<nums.length; i++)
            {
                if(used[i] == true)
                {
                    continue;
                }
                else
                {
                    currList.add(nums[i]);
                    used[i]=true;
                    backtrackPermutation(nums,finalResult,currList,used);
                    used[i]=false;
                    currList.remove(currList.size()-1);
                }
            }
        }
    }
}*/
