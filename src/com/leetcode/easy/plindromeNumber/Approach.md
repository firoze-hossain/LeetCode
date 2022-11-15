==>We can easily solve this problem by reversing the given number and comparing the reversed number with the given number.
<br/>
i)If the number is negative, return false, else proceed to #2.<br/>
ii)Store the given number x in a variable number. We are doing it because we will perform our operations on number and due to that, it’s value will change. We will use x at the end of the program to compare with the reversed number.
Reverse the number.<br/>
iii)Return true if the reverse number and given number are equal, false otherwise.<br/>
<b>Time Complexity</b><br/>
Since we are going through the entire number digit by digit, the time complexity should be O(log10n). The reason behind log10 is because we are dealing with integers which are base 10.
<br/>
<b>Space Complexity</b><br/>
We are not using any data structure for interim operations, therefore, the space complexity is O(1).