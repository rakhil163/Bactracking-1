Time Complexity-Exponential
Space Complexity-O(n)
Leetcode Submission-Successful
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<>();
        backtrack(candidates,new ArrayList<>(),target,0);
        return result;
    }
    private void backtrack(int[] candidates,List<Integer> temp,int target,int index)
    {
        if(target<0)
            return;
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        
        for(int i=index;i<candidates.length;i++)
        {
            if(target>=candidates[i])
            {
            temp.add(candidates[i]);
            backtrack(candidates,temp,target-candidates[i],i);
            temp.remove(temp.size()-1);
            }
        }
        return;
    }
}
