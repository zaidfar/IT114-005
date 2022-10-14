<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 10/14/2022 7:41:13 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/195956632-f0267330-2e02-42c4-827e-b4b999a0c11b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Display higher or lower as a hint after a wrong guess.  What<br>I am showing is the code for how the &quot;guess&quot; would relate to<br>the &quot;number&quot; <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/195956819-b99f4dc0-f054-4391-ae9c-72499122658f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I guessed too high one time and too low one time and the<br>program told me to guess higher and lower.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>So the code is an if and else if statement in processGuess.&nbsp; Basically<br>what the code is saying is that if your &quot;guess&quot; number is greater<br>than the actual number, than you need to pick a number that is<br>lower (which is the numHint variable) and vice versa if &quot;guess&#39; is lower<br>than &quot;number&quot;.<div>numHint will be different based on which condition is true and printed<br>in line 150.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/195957355-8967f7aa-9c87-4ed0-a8ad-bd26609a50e1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Add a difficulty selector that adjusts the max strikes per level. This is<br>the code for that.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/195957439-2fc3f305-7380-446e-b5c4-cbe3163c4df5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This is the output showing the difficulty being incrased, via the maxstrikes being<br>decreased by 1. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>So the first I saw that maxStrikes was already defined as 5 strikes<br>at the start of the program.&nbsp; The way to implement this feature would<br>be a way to lower maxStrikes each time a guess was correct .&nbsp;<br>So I just made it so that maxStrikes would increase each time a<br>guess was correct. and vice versa if the strikes were reached.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/zaidfar/IT114-005/pull/5">https://github.com/zaidfar/IT114-005/pull/5</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I learned how to implement the stuff in zybooks into actual working code.&nbsp;<br>Mostly using if, else if statements to make the too high or too<br>low problem and similarly for the level increment.&nbsp; &nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/zf5" target="_blank">Grading</a></td></tr></table>