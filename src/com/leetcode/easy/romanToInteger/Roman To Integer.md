https://leetcode.com/problems/roman-to-integer/<br/>
<b>13. Roman to Integer</b><br/>

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.<br/>

<b>Symbol</b>    &nbsp; &nbsp; &nbsp;  <b> Value</b><br/>
I                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;   1<br/>
V                &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  5<br/>
X                &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 10<br/>
L                &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp; 50<br/>
C                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; 100<br/>
D                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp;500<br/>
M                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;1000<br/>
For <b>example</b>, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. <br/>
X can be placed before L (50) and C (100) to make 40 and 90. <br/>
C can be placed before D (500) and M (1000) to make 400 and 900.<br/>
Given a roman numeral, convert it to an integer.<br/>

 

<b>Example 1:</b><br/>

<b>Input:</b> s = "III"<br/>
<b>Output:</b> 3<br/>
<b>Explanation:</b> III = 3.<br/>
<b>Example 2:</b><br/>

<b>Input:</b> s = "LVIII"<br/>
<b>Output:</b> 58<br/>
<b>Explanation:</b> L = 50, V= 5, III = 3.<br/>
<b>Example 3:</b><br/>

<b>Input:</b> s = "MCMXCIV"<br/>
<b>Output:</b> 1994<br/>
<b>Explanation:</b> M = 1000, CM = 900, XC = 90 and IV = 4.<br/>
 

<b>Constraints:</b><br/>

1 <= s.length <= 15<br/>
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].