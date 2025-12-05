# [Bronze III] Ball Throw- 10810 

[Problem Link](https://www.acmicpc.net/problem/10810) 

### Performance Summary.

Memory: 1112 KB, Time: 0 ms

### Categories

Implementation, simulation

### Problem Statement

<p>Dohyun has N baskets, each numbered 1 through N. He also has a large number of balls, each numbered 1 through N. The first basket contains no balls, and each basket can only hold one ball.</p>

<p>Dohyun is trying to place ball M. Each time he places a ball, he selects a range of baskets to place the ball in and places all balls with the same number in each selected basket. If a basket already contains a ball, he removes it and places a new ball in it. The baskets must be consecutive.</p>

<p>Given the instructions for placing the balls, write a program that calculates.</p>

### Input 

<p>The first line contains N (1 ≤ N ≤ 100) and M (1 ≤ M ≤ 100).</p>

<p>The second and subsequent M lines contain instructions for placing balls. Each instruction consists of three integers, i, j, k, which indicate placing the ball with number k in each of the baskets from i to j. For example, 2 5 6 means placing ball 6 in each of the baskets from 2 to 5 (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N).<</p>

<p>Dohyun places balls in the order given in the input.</p>

### Output

<p>Print the numbers of the balls in baskets 1 through N, separated by spaces. If there are no balls in the basket, print 0.</p>