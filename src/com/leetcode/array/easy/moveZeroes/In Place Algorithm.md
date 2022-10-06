<!-- Output copied to clipboard! -->

<!-- You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 1 -->

**In-place Algorithm**

=================

**Strict Definition:** 

An in-place algorithm is an algorithm that does not need an extra space and produces an output in the same memory that contains the data by transforming the input ‘in-place’. However, a small constant extra space used for variables is allowed.

**Broad Definition:**  

In-place means that the algorithm does not use extra space for manipulating the input but may require a small though non-constant extra space for its operation. Usually, this space is O(log n), though sometimes anything in O(n) (Smaller than linear) is allowed.

**Illustration of the Process:**


![alt_text](images/image1.png "image_tooltip")


We have **O(n)** extra space required since we have two arrays to manipulate with. Besides that, creating and removing a new array is usually a slow operation.
