<h2><a href="https://www.geeksforgeeks.org/problems/rotate-bits4524/1?page=1&category=Bit%20Magic&sortBy=submissions">Rotate Bits</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer <strong>N</strong> and an integer <strong>D</strong>, rotate the binary representation of the integer N by D<strong> </strong>digits to the <strong>left </strong>as well as <strong>right </strong>and return the results in their <strong>decimal&nbsp;representation </strong>after each of the rotation.<br>Note: Integer N is stored using <strong>16 bits</strong>. i.e. 12 will be stored as 0000</span><span style="font-size: 18px;">0000</span><span style="font-size: 18px;">0000</span><span style="font-size: 18px;">1100. <strong>Output array</strong> should follow <strong>{leftrotation, rightrotation}.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 28, d = 2
<strong>Output: </strong>[112, 7]
<strong>Explanation</strong>: 28 in Binary is: 0000000000011100. Rotating left by 2 positions, it becomes 0000000001110000 = 112 (in decimal). Rotating right by 2 positions, it becomes 0000000000000111 = 7 (in decimal).</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 29, d = 2
<strong>Output:</strong> [116, 16391]
<strong>Explanation</strong>: 29 in Binary is: 0000000000011101. Rotating left by 2 positions, it becomes 0000000001110100 = 116 (in decimal). Rotating right by 2 positions, it becomes 010000000000111 = 16391 (in decimal).<br></span></pre>
<pre><strong>Input</strong>: n = 11, d = 10
<strong>Output:</strong> [11264, 704]</pre>
<p><strong style="font-size: 18px;">Constraints:<br></strong><span style="font-size: 18px;">1 &lt;= n &lt;&nbsp; 2<sup>16</sup><br>1 &lt;= d &lt;= 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Data Structures</code>&nbsp;