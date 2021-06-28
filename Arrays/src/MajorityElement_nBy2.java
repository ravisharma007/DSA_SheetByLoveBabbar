/*
class Driver
{
    public static void main(String[] args) {
        int [] arr={1,2,2,1,1};
        Solution obj=new Solution();
        int x= obj.majorityElement(arr,arr.length);
        System.out.println("Majority element: " + x);
    }
}

class Solution {
    public int majorityElement(int[] arr, int n) {
        //Majority element or find the element count more than n/2
        //here Moore's Voting algorithm will be used to do this task.

        int majority = arr[0];
        int count = 1;

        // Finding Majority element in array
        for (int i = 1; i < n; i++) {
            if (arr[i] == majority) {
                count += 1;
            } else {
                count -= 1;
            }

            if (count == 0) {
                majority = arr[i];
                count = 1;
            }
        }

        //Checking if found Majority is valid or not
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == majority)
                count++;
        }

        return (count > n / 2) ? majority : -1;
    }
}*/
