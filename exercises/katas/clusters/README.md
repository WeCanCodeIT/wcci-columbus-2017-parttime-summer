# Clusters kata

## The problem

Let's say that we have a `Collection<Integer>` or an `int[]` (array) of numbers, and we would like to count the
groups of adjacent elements with the same value (clumps).

### Example

input           |output
-----           |------
1,4,4,4,9,6,6,7 |2 (4s and 6s)
1,2,3			|0
5,2,2,2,4		|1


## The tests

1. Test for zero clusters.
1. Test for one cluster of only two elements.
1. Test for multiple clusters of only two elements.
1. Test for multiple clusters where at least one cluster has more than two elements.