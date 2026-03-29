# [Silver V] Your Rating - 25206

Problem Link(https://www.acmicpc.net/problem/25206) 

### Performance Summary

Memory: 32412 KB, Time: 36 ms

### Category

Math, Implementation, String

### Problem Description

<p>To graduate from the Department of Computer Engineering at Inha University, one must either have a major GPA of 3.3 or higher, or pass the graduation exam. But oops, Chihoon realized he forgot to take the graduation exam!</p>

<p>Let's write a program that calculates Chihoon's major GPA.</p>

<p>The major GPA is calculated by dividing the sum of (credit × subject grade point) for each major subject by the total sum of credits.</p>

<p>The subject grade points according to the grades in the Department of Computer Engineering at Inha University are shown in the following table.</p>

<table border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 150px;">
<tbody>
<tr>
<td style="text-align: center;">A+</td>
<td style="text-align: center;">4.5</td>
</tr>
<tr>
<td style="text-align: center;">A0</td>
<td style="text-align: center;">4.0</td>
</tr>
<tr>
<td style="text-align: center;">B+</td>
<td style="text-align: center;">3.5</td>
</tr>
<tr>
<td style="text-align: center;">B0</td>
<td style="text-align: center;">3.0</td>
</tr>
<tr>
<td style="text-align: center;">C+</td>
<td style="text-align: center;">2.5</td>
</tr>
<tr>
<td style="text-align: center;">C0</td>
<td style="text-align: center;">2.0</td>
</tr>
<tr>
<td style="text-align: center;">D+</td>
<td style="text-align: center;">1.5</td>
</tr>
<tr>
<td style="text-align: center;">D0</td>
<td style="text-align: center;">1.0</td>
</tr>
<tr>
<td style="text-align: center;">F</td>
<td style="text-align: center;">0.0</td>
</tr>
</tbody>
</table>

<p>In the case of P/F subjects, the grade is marked as <code>P</code> or <code>F</code>. Subjects with a grade of <code>P</code> must be excluded from the calculation.</p>

<p>Will Chihoon be able to graduate safely?</p>

### Input

<p>Over <strong>20</strong> lines, the subject name, credit, and grade of the major subjects Chihoon took are given, separated by spaces.</p>

### Output

<p>Print Chihoon's major GPA.</p>

<p>It is accepted as the correct answer if the absolute or relative error with the correct answer is 10 
−4
  or less.</p>
