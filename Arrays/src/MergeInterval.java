/*

import java.util.Arrays;
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        //Sorting 2D array on basis of 1st Column :-
        // where iarr : internal array
        Arrays.sort(intervals, (iarr1,iarr2) -> Integer.compare(iarr1[0],iarr2[0]) );

        List<int[]> intervalList= new ArrayList<>();

        //                        0 1
        //intervals[0] :- [0]->[]{1,3}
        //intervals[1] :- [1]->[]{2,6}
        //intervals[2] :- [2]->[]{8,10}
        //intervals[3] :- [3]->[]{15,18}
        int [] intervalToCompare = intervals[0];
        int j=1;

        while(j < intervals.length)
        {
            if(intervals[j][0] <= intervalToCompare[1]) // Two intervals overlap, so we merge intervals as intervalToCompare
            {
                intervalToCompare = new int[]{intervalToCompare[0], Math.max(intervalToCompare[1],intervals[j][1])};
            }
            else //Provided Intervals are not Overlapping, so just add intervalToCompare to the list and update intervalToCompare
            {
                intervalList.add(intervalToCompare);
                intervalToCompare = intervals[j];
            }
            j++;
        }

        //After loop the last interval left over in intervals, just add this last one to intervalList.
        intervalList.add(intervalToCompare);

        int [][] resultArray=new int[intervalList.size()][*/
/* 2 *//*
];
        for(int i=0; i<intervalList.size();i++)
        {
            resultArray[i]=intervalList.get(i);
        }
        return resultArray;
    }
}

*/
