# [Silver V] Crotia Alphabet - 2941 

[Problem Link](https://www.acmicpc.net/problem/2941) 

### Performance Summary

Memory: 1112 KB, Time: 0 ms

### Categories

Implementation, String

### Problem Description

<p>Previously, it was not possible to input the Croatian alphabet in the operating system. Therefore, the Croatian alphabet was changed and entered as follows.</p>

<table class="table table-bordered table-center-20 th-center td-center">
	<thead>
		<tr>
			<th>크로아티아 알파벳</th>
			<th>변경</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>č</td>
			<td>c=</td>
		</tr>
		<tr>
			<td>ć</td>
			<td>c-</td>
		</tr>
		<tr>
			<td>dž</td>
			<td>dz=</td>
		</tr>
		<tr>
			<td>đ</td>
			<td>d-</td>
		</tr>
		<tr>
			<td>lj</td>
			<td>lj</td>
		</tr>
		<tr>
			<td>nj</td>
			<td>nj</td>
		</tr>
		<tr>
			<td>š</td>
			<td>s=</td>
		</tr>
		<tr>
			<td>ž</td>
			<td>z=</td>
		</tr>
	</tbody>
</table>

<p>For example, ljes=njak consists of 6 Croatian alphabet letters (lj, e, š, nj, a, k). Given a word, output how many Croatian alphabet letters it is composed of.</p>

<p>dž is always written as a single letter and is not considered as d and ž. The same applies to lj and nj. Alphabet letters not in the list above are counted as separate letters.</p>

### Input 

 <p>The first line limit is given 100 alphabet All alphabet is consist alphabet lower case and '-', '='.</p>

<p>Word is consist the croatia alphabet. The alphabets shown in the problem description table are entered in a modified form.</p>

### Output 

 <p>Print the how much do consist the croatia alphabet.</p>

