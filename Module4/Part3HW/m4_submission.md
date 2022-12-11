<table><tr><td> <em>Assignment: </em> IT114 - Sockets Part 1 - 3</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 12/11/2022 4:09:49 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-sockets-part-1-3/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch for this assignment</li><li>Go through the socket lessons and get each part implemented (parts 1-3)</li><ol><li>You'll probably want to put them into their own separate folders/packages</li></ol><li>Create a new folder called Part3HW</li><li>Create an empty m4_submission.md file in Part3HW (or skip this step and download the file at the end)</li><ol><li>Add/commit/push the branch</li><li>Create a pull request to main and keep it open</li></ol><li>Copy the the Part3 code into this new folder (Part3HW)</li><li>Git add/commit all of the sample code and the Part3HW code</li><li>Implement two of the following <b>server-side</b> activities for all connected clients (majority of the logic should be processed server-side and broadcasted to all clients if/when applicable)</li><ol><li>Simple number guesser where all clients can attempt to guess</li><ol><li>Hint: may want separate commands to start, stop, and guess (or starting lasts for x rounds then stops)</li><li>No need to implement complexities like strikes</li></ol><li>Coin toss command (random heads or tails)</li><li>Dice roller given a command and text format of "roll #d#" (i.e., roll 2d6)</li><li>Math game (server outputs a basic equation, first person to guess it correctly gets congradulated and a new equation is given)</li><ol><li>Hint: may want separate start, stop, answer commands (or starting lasts for x rounds then stops)</li></ol><li>Private message (a client can send a message targetting another client where only the two can see the messages)</li><li>Message shuffler (randomizes the order of the characters of the given message)</li></ol><li>Fill in the below deliverables</li><li>Save and generated the markdown or markdown file</li><li>Update the m4_submission.md file in the Part3HW folder</li><li>Add/commit/push your changes</li><li>Merge the pull request</li><li>From the M4-Sockets branch, navigate to your m4_submission.md file on github and copy the link</li><li>Submit the direct link to Canvas</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Baseline </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add as many screenshots as necessary to show basic communication among 3 clients and 1 server</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206892068-de4bb34a-1145-4ea0-9971-9104198587e6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows the server and 3 clients connected, all the clients sent a message<br>and all recieved messages<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Feature Implementation 1 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <p><br><div><span style="font-size: 16px; color: var(--darkreader-inline-color) ; font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;,<br>Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;;">I picked coin flip for<br>my first.&nbsp; &nbsp;I had to make an array that had heads and tails<br>and then made an&nbsp; if statement.&nbsp;&nbsp;</span><br></div><div><font color="#f6efe6" face="-apple-system, BlinkMacSystemFont, Segoe UI, Noto Sans,<br>Helvetica, Arial, sans-serif, Apple Color Emoji, Segoe UI Emoji" data-darkreader-inline-color="" style="--darkreader-inline-color:#ffffef;"><span style="font-size: 16px;">After<br>that I made a while loop with an if statement to get the<br>client id and generate a random integer and broadcasted that message</span></font></div><br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206892248-271ad5da-d595-4c2e-b252-77abd81fc9c9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I&#39;m showing what happens when I type out &quot;Coin Flip&quot; into one of<br>the clients, all the clients either broadcast &quot;Heads&quot; or &quot;Tails&quot;<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Add screenshot(s) of related code changes to highlight the new logic</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206892376-563a839d-4608-4762-9587-aea5b23b6712.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In line 16 you can see that I made an array for the<br>heads and tails feature.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206894329-ba7631bb-f2d2-4a63-88d4-f0e33c9c5bba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Lines 76-86 is the code for the coin flip.  It uses a<br>while loop within a if statement and calls upon serverthread to iterate between<br>the different clients.  it uses the array for heads and tails in<br>line 16 of the code and random.nextInt() to pick heads or tails.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Feature Implementation 2 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <div><span style="background-color: rgb(6, 13, 22); color: rgb(222, 215, 202); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe<br>UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;; font-size:<br>16px; --darkreader-inline-bgcolor:#000000; --darkreader-inline-color:#f6efe6;" data-darkreader-inline-bgcolor="" data-darkreader-inline-color="">For the second feature I picked dice roll.&nbsp; i<br>used an if statement to roll the dice and made an array for<br>user input.&nbsp; &nbsp;</span></div><div><span style="background-color: rgb(6, 13, 22); color: rgb(222, 215, 202); font-family: -apple-system,<br>BlinkMacSystemFont, &quot;Segoe UI&quot;, &quot;Noto Sans&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI<br>Emoji&quot;; font-size: 16px; --darkreader-inline-bgcolor:#000000; --darkreader-inline-color:#f6efe6;" data-darkreader-inline-bgcolor="" data-darkreader-inline-color="">I then made a for loop to<br>iterate through the array and create random( ) numbers based off a 6<br>sided die</span><br></div><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206895163-8443e8c9-9145-4ae9-ae8a-e369d96f14d4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I type out &quot;Roll 2d6&quot; into one of the clients input and that<br>client and the other 2 clients roll a dice twice <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Add screenshot(s) of related code changes to highlight the new logic</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/206895221-3f6366c3-17e0-4470-8b09-4588cdab6b4d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I&#39;m using a for loop to iterate through the 6 sides of a<br>dice and .random() to pick a random integer between 1-6.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Did you have an issues and how did you resolve them? If no issues, what did you learn during this assignment that you found interesting?</td></tr>
<tr><td> <em>Response:</em> <p>I learned how to implement certain games into the chat feature.<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Pull request link</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/zaidfar/IT114-005/pull/10">https://github.com/zaidfar/IT114-005/pull/10</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-sockets-part-1-3/grade/zf5" target="_blank">Grading</a></td></tr></table>