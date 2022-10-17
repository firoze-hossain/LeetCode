<b>Approach</b><br/>
Idea:<br/>
The main observation is that each F(i) is depending on the sum of F(i-1) and F(i-2). Thus we can take two variables that will store the initial value, then we will iterate till N to get the result.

<b>Explanation</b><br/>
N==0: return 0
N==1: return 1
default: return fib(N-1) + fib(N-2)
let’s talk about the second approach:

Considering the sequence of [34,55,89] we can see a pattern that is if we divide any two consecutive terms, the division results in an identical number close to 1.618 called the golden ratio. Indeed we have the formula to do this! called Binet’s formula.

Okay? how can we use this golden something! 34 is the 9th term, If we find the pow(golden,Nth term)/sqrt(5) enclosed with a round function, we would get the Nth term value in O(1) time & space!