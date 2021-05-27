/*
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> hashSet=new HashSet<>();
        backtrackPermute(nums,hashSet,new ArrayList<>(),new boolean[nums.length]);

        List<List<Integer>> finalList = new ArrayList<>(hashSet);
        return finalList;
    }

    public void backtrackPermute(int [] nums, Set<List<Integer>> hashSet, ArrayList<Integer> currList,boolean []used)
    {
        if(currList.size()== nums.length)
        {
            hashSet.add(new ArrayList<>(currList));
            return;
        }

        for(int i=0; i< nums.length; i++)
        {
            if(used[i])
                continue;

            currList.add(nums[i]);
            used[i]=true;

            backtrackPermute(nums,hashSet,currList,used);

            currList.remove(currList.size()-1);
            used[i]=false;

        }
    }
}*/
