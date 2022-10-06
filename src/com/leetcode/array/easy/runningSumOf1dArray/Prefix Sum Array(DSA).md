<!-- Output copied to clipboard! -->

<!-- Yay, no errors, warnings, or alerts! -->

**Prefix sum array**

===============

it's a good introduction to the concept of a prefix sum array. Prefix sum arrays have many uses in more complex algorithms and can sometimes help reduce the time complexity of a advanced solution by an order of magnitude.

In a prefix sum array, we will create a duplicate array which contains the running sum of the elements 0 to i of our original array (nums) for each index i of our prefix sum array (ans). (Note: We can lower the space complexity by using an in-place approach with nums directly and mutating it into its own prefix sum array, if there is no compelling reason to avoid modifying a function argument.)

Since we'll need to build on a previous running total, we should start our iteration at i = 1 and copy over the first element from nums to ans. Then we just iterate through nums and add each element (nums[i]) to the previous running total (ans[i-1]) to create the new running total (ans[i]).

When we're done, we can return ans.

Time Complexity: O(N) where N is the length of nums

Space Complexity: O(N) for our running sum array

or O(1) with an in-place approach
