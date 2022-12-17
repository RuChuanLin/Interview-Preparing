# Heap

## 性質

最小堆意味著：陣列的第一位是陣列的最小值。

## Practices
### [2406. Divide Intervals Into Minimum Number of Groups](https://leetcode.com/contest/weekly-contest-310/problems/divide-intervals-into-minimum-number-of-groups/)

找不相疊的思路是：

貪算，發現一個區間的下家是離它結束點最近的區間

如果下一個區間的開始大於上一個區間的結束，代表他們可以算做同一group
