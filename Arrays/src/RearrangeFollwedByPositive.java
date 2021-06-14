/*

class Driver
{
    public static void main(String[] args) {
        int[] nums={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        Solution obj=new Solution();
        obj.rearrange(nums,nums.length);

       for(int i=0;i<nums.length;i++)
       {
           System.out.print(nums[i] + " ");
       }

//       for(int x : nums)
//       {
//           System.out.print(x + " ");
//       }

    }
}

class Solution
{
    public void rotation(int[] nums,int start,int end)
    {
        int temp=nums[end];

        for(int i =end; i>=start; i--)
        {
            nums[i]=nums[i-1];
        }
        nums[start]=temp;
    }

    public void rearrange(int[] nums,int n)
    {
        int i=0,j=0,k=0;

        while(k < n && i<n && j<n)
        {
            if(k%2==0)
            {
                if(nums[k] >=0)
                {
                    i=j=k;
                    while(i<n && nums[i]>=0)
                        i++;
                    if(i >=n)
                        break;
                    rotation(nums,j,i);
                }

            }
            else
            {
                if(nums[k] <0)
                {
                    i=j=k;
                    while (j<n && nums[j] <0)
                        j++;

                    if(j >=n)
                        break;

                    rotation(nums,i,j);
                }
            }

            k++;
        }
    }
}*/
