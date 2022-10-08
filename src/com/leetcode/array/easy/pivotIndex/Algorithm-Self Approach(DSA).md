<!-- Output copied to clipboard! -->

<!-- Yay, no errors, warnings, or alerts! -->

**Algorithm-Self Approach**

=======================

**Solution:**

From the problem statement it is clear that we need to check for a pivot index for every element in an array. To make an efficient code we need a suitable approach before we start to write the code.

In this problem, we need to calculate sum the elements to the left of the current element taken and sum of the elements to the right of it and then check if they are equal or not.

To simplify the problem, we can just calculate sum of all the elements in an array beforehand and then apply our main solution. This will reduce our tasks and we just have to calaculate left sum and then evaluate it for the required answer.

**Algorithm:**



* Create variables total and leftSum and initialize them with 0.
* Calculate the sum of all elements of the given array and update total to this sum.
* To find the pivot index, traverse through the array by iteration and check whether leftSum = total - leftSum - nums[i].
* If the above condition is true then return i that will be your pivot index.
* Return -1 otherwise.