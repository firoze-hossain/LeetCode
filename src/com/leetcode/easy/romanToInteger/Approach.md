1.Convert Input roman numeral to char array<br/>
2: Create Map of each roman numeral char and its corresponding value<br/>
3: Traverse input char array<br/>
4: for each char array calculate<br/>
   a: If current roman numeral value is greater than next roman
      numeral  - value then add the value of current roman numeral
      to the total sum <br/>
   b: If the current roman numeral value is less than the next roman
      numeral then we should subtract it from total sum<br/>
5: Finally add the last numeral value to the sum and return the total sum