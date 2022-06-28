### Problem
- Take an integer,hour as input which would depict the time in hours for the day in 24-hours Format.
- Print "good morning" if the hour is less than 12, print "good afternoon" if the hour is greater than or equal to 12 or less than or equal to 16, print "good evening" if the hour is greater than 16 or less than or equal to 20, and print "good night" if hour is greater than 20

### Note
- If the input is greater than 24, which is more than number of hours in a day, print invalid input.

### Input Format
- Single line of input
- An integer, hour, representing the time of day in hours

### Output Format
- Single line of output
- A String representing the relevent greeting, according to rules defined above

```
Sample Input 0

10
Sample Output 0

good morning
Explanation 0

Since 10 is less than 12, therefore output will display good morning

Sample Input 1

20
Sample Output 1

good evening
Explanation 1

Since hour is equal to 20, therefore according to rules provided, output will be good evening
```