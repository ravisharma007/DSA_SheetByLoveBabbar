/*
import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public List<String> find_permutation(String s) {
        // Code here

        char[] crr=s.toCharArray();
        List<String> finalList=new ArrayList<>();

        permutation(crr,finalList,new ArrayList<>(),new boolean[s.length()]);
        finalList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return finalList;
    }

    public void permutation(char[] crr,List<String> finalList,List<Character> currList,boolean[] visited)
    {
        if(currList.size() == crr.length )
        {
            String st=currList.stream().map(item -> String.valueOf(item)).collect(java.util.stream.Collectors.joining(""));
            finalList.add(st);
        }
        else
        {
            for(int i=0;i<crr.length;i++)
            {
                if(visited[i])
                    continue;
                else
                {
                    currList.add(crr[i]);
                    visited[i]=true;
                    permutation(crr,finalList,currList,visited);
                    visited[i]=false;
                    currList.remove(currList.size()-1);
                }
            }
        }
    }
}*/
