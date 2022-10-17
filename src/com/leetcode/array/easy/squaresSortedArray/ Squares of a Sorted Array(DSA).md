<!-- Output copied to clipboard! -->

<!-- Yay, no errors, warnings, or alerts! -->

**Squares of a Sorted Array-DSA([Link](https://leetcode.com/problems/squares-of-a-sorted-array/))**

**An efficient solution is based on the two-pointer method as the array is already sorted we can compare the first and last element to check which is bigger and proceed with the result. **

**Algorithm:**



* **Initialize left=0 and right=n-1**
* **if abs(left) >= abs(right) then store square(arr[left]) \
at the end of result array and increment left pointer**
* **else store square(arr[right]) in the result array and decrement right pointer**
* **decrement index of result array**