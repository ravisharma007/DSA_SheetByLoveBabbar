/*
import java.util.*;


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here

        int sum=x;
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                return true;
            }
            s.add(arr[i]);
        }


        return false;

    }
}*/
