https://leetcode.com/problems/search-insert-position/<br/>
<b>35. Search Insert Position</b> <br/>
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    <br/>
You must write an algorithm with O(log n) runtime complexity.<br/>

<b>Example 1:</b> <br/>

<b>Input:</b>  nums = [1,3,5,6], target = 5<br/>
<b>Output:</b>  2<br/>
<b>Example 2:</b> <br/>

<b>Input:</b>  nums = [1,3,5,6], target = 2<br/>
<b>Output:</b>  1<br/>
<b>Example 3:</b> <br/>

<b>Input:</b>  nums = [1,3,5,6], target = 7<br/>
<b>Output:</b>  4<br/>


<b>Constraints:</b> <br/>

1 <= nums.length <= 104<br/>
-104 <= nums[i] <= 104<br/>
nums contains distinct values sorted in ascending order.<br/>
-104 <= target <= 104