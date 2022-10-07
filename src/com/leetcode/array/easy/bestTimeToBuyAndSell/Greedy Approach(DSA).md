<!-- Output copied to clipboard! -->

<!-- You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 1 -->

**Greedy Algorithms**

==================

Greedy is an algorithmic paradigm that builds up a solution piece by piece, always choosing the next piece that offers the most obvious and immediate benefit. So the problems where choosing locally optimal also leads to global solution are the best fit for Greedy.

For example consider the Fractional Knapsack Problem. The local optimal strategy is to choose the item that has maximum value vs weight ratio. This strategy also leads to a globally optimal solution because we are allowed to take fractions of an item.


![alt_text](https://github.com/firoze-hossain/LeetCode/blob/master/src/com/leetcode/images/Fractional-Knapsack.png "Fractional Knapsack")


**Approach :**

This problem can be solved using the greedy approach. To maximize the profit we have to minimize the buy cost and we have to sell it at maximum price. 

Follow the steps below to implement the above idea:



* Declare a buy variable to store the buy cost and max_profit to store the  maximum profit.
* Initialize the buy variable to the first element of the prices array.
* Iterate over the prices array and check if the current price is minimum or not.
* If the current price is minimum then buy on this ith day.
* If the current price is greater than the previous buy then make profit from it and maximize the max_profit.

Finally, return the max_profit.
