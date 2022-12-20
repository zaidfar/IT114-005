<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 12/20/2022 2:23:09 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone-2/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208590244-c7e3d1f1-6230-45b3-8741-442ee3607714.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing payload.java  The shown code of getMessage() returns a message.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208590474-8d1923f9-0fbb-4b0c-8136-2df93e4ef9a9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Different payload types like connect, disconnect etc.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208590646-7c7f5af9-2d97-4651-9b5d-04d65c7983da.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The client shows the user and the message being sent as a payload<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208591052-183d8f6e-29f6-4e1c-a80f-c7d267ac9d9f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Used the enum Create_Room in PayloadTypes.java to create a room in the client<br>by using the command /createroom Bob<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208594740-4da061b4-e84e-4326-8ef8-d02c0fedfb97.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The output of the /CoinFlip command <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208595019-2097cece-8d56-488d-a949-fcfdbdabd466.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The output of the &quot;/Roll xdx&quot; command<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208591566-2310e272-d62f-497c-bd3d-a69ece3cc35f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The code in Room.java for the &quot;/Roll xdx&quot; command<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208594198-fb22d6cd-6f97-4034-becb-7955e467188c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The code for &quot;/CoinFlip&quot; command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>For the Roll command the code first checks if the message has /Roll<br>in it&nbsp; and will split the string in an array of strings if<br>it does.&nbsp; &nbsp;The code will then generate a number and broadcast it on<br>the clients screen if the client&#39;s ID is equal to the client ID<br>in the message.<div><br></div><div>For /CoinFlip the code makes an iterator that goes to all<br>the clients on the server.&nbsp; The code will use an array that has<br>{heads, tails}&nbsp; thats in a private string at the start of the file&nbsp;<br>and randomly pick a side with random.nextInt() and broadcast that with<span style="background-color: rgb(30,<br>30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"><br>broadcast(&quot;your roll is&quot; + die, clientId);</span></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208596813-803f97a9-6421-4d51-8609-716729250c51.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code in Room.java  for how bold, italics, color and underline<br>are processed<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208600458-687771cd-591f-40e9-9a00-33ca5f070436.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In line 154 in chatpanel.java i changed JEditorPane to be text/html instead of<br>text/plain which will allow html chat stuff to work<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208601239-97810ee0-06a8-44f3-a441-e422a7419c3e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I showed bold, italics, color, underline and a mix of all in one<br>line.  You can also see in the terminal what I wrote into<br>the chat to get those displays<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>So in chatpanel I first changed JeditorPane to make the chat into text/html<br>which means that html tags will work now for input on the chat.&nbsp;<br>That means the code in room.java that converts the simplified characters into html<br>tags will work.<div><br></div><div>For bold you need to write <strong>text</strong> and it will convert<br>that into &lt;b&gt;I&lt;/b&gt; where you put the text where the I is.&nbsp; Those<br>are html tags that work because of the jeditorpane edit and will make<br>the input bold</div><div>For italics it works a similar way but instead you do<br>--text--.</div><div>For underline it works a similar way but you do <strong>text</strong>.</div><div>For red green<br>and blue colored text you do the same but you do #r#text#r# to<br>convert into red colored text.&nbsp; For green and blue you would do #g#<br>and #b# instead.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/zaidfar/IT114-005/pull/12">https://github.com/zaidfar/IT114-005/pull/12</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone-2/grade/zf5" target="_blank">Grading</a></td></tr></table>