<!-- Output copied to clipboard! -->

<!-- You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 1 -->

**Approach(Boyer-Moore Voting Algorithm)**

This problem is a nice illustration of how can we find a majority element in a stream of elements. The Boyer-Moore Voting algorithm is used to find the element that occupies more than ⌊N / 2⌋ places in a sequence. This algorithm maintains a candidate and its count in the array. We run a single pass of the array with candidate = -1 and count = 0. If any element in the array is the candidate, we increment count. Otherwise, we decrement it. If the count becomes zero, we change the candidate and set its count back to 0.

In order to understand its functioning, follow the example below:


![alt_text](https://github.com/firoze-hossain/LeetCode/blob/master/src/com/leetcode/images/Boyer-Moore%20Voting%20Algorithm.png "Boyer-Moore Voting Algorithm")


This algorithm considers the process as an election and first decides a candidate. The one who gets the most votes is the majority candidate. In the above example, we choose a candidate as 1 initially, but as we reach index 4 in the array, we observe that count = 0, which means that we have seen as many candidates as non-candidates. So, we choose the current element as a candidate and continue the process. Since we are guaranteed to have a majority element in the array, the last candidate we are left with will be the majority element.

**Algorithm**

1. Initialize two variables: candidate and cnt to store the candidate and its frequency for respective iterations

2. Now, for every element i in the array:



* If cnt is equal to zero:
* update: candidate = i
* If i is equal to candidate:
* increment cnt: cnt++
* Else:
* Decrement cnt: cnt–

3. Return candidate

4. Print the result

**Time Complexity**

O(N) as we traverse the whole array once. Here, N = size of the array.

**Space Complexity**

O(1) as we use constant memory space.
