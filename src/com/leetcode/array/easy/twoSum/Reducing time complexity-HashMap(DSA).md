<!-- Output copied to clipboard! -->

<!-- Yay, no errors, warnings, or alerts! -->

**Reducing time complexity(HashMap)**

If we use HashMap to store numbers and indices of given array, finding complement of each number will be way faster than searching them sequentially. Its time complexity is O(1) to find complement since HashMap calculates, not searching, the index based on the key. So, if we store n elements in the HashMap(O(n)) and determine whether each element’s complement is in the HashMap or not(O(1)), time complexity of our program will be O(n). 
