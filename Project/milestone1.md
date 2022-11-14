<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 11/14/2022 6:27:57 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201778172-39f667f7-0160-40aa-ad28-41b4452fd55c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In the terminal you can see I compiled Server.java and also ran it.<br> It started listening.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201778612-2ce85bb9-2c41-4114-ad43-a4635ce46d59.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>You can see the client waiting for input and than it connects to<br>the server successfully <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server side of the connection works as listening for all clients to<br>connect for it.&nbsp; It acts as a back and forth platform for multiple<br>clients to connect to as the &quot;hub&quot; of connections.&nbsp; The server listens for<br>clients and creates a lobby on start that clients will connect to.&nbsp; The<br>server will then attempt to listen to the clients commands in assigning them<br>rooms.&nbsp; I<div><br></div><div>The client side works by connecting one IP address (client)&nbsp; that can<br>connect to the&nbsp; server and message other users in chatrooms through the server.&nbsp;<br>The client will ask for a name before being able to connect to<br>the localhost and port.&nbsp; While sending messages the client will keep listening for<br>strings from the server (from other users)</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201779938-70ff28b0-24bc-4c02-8a0f-992ff3cfe685.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Two clients connected to the server.  One user is named Zaid and<br>the other is Billy.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201780163-8ed36d36-30f4-4429-81b9-c7451c78802d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Both clients are able to send messages to the server and the server<br>can broadcast the messages to all the clients in the room.  The<br>messages also show who is sending the messages by an identifier<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201780839-f91e0b6d-67d2-4de2-8840-107e06daaf70.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I created a room called &quot;test&quot; and had Billy write &quot;hello zaid&quot;. <br>The client with &quot;Zaid&quot; is not able to see the message.  Server<br>was able to see the message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>Client sending:&nbsp; The client needs an IP and port to connect to and<br>a username.&nbsp; The client is sending messages with &quot;sendMessage&quot;&nbsp;<div><br></div><div><font color="#dcdcaa" face="Consolas, Courier New,<br>monospace"><span style="white-space: pre; background-color: rgb(30, 30, 30);">ServerThread: A serverthread works with the server<br>to represent a single client.  It gets the client and helps it<br>connect to the different rooms </span></font></div><div><font color="#dcdcaa" face="Consolas, Courier New, monospace"><span style="white-space: pre;<br>background-color: rgb(30, 30, 30);">in the server and will also disconnect the client when<br>needed and relay messages from the single client</span></font></div><div><br></div><div><font color="#dcdcaa" face="Consolas, Courier New, monospace">&lt;span<br>style=&quot;white-space: pre; background-color: rgb(30, 30, 30);&quot;&gt;Room: The rooms allow clients  to connect,<br>disconnect, create, join, logout, and logoff.  It allows the creation of unique<br>rooms.</span></font></div><div><font color="#dcdcaa" face="Consolas, Courier New, monospace"><span style="white-space: pre; background-color: rgb(30, 30, 30);"><br></span></font></div><div>&lt;font color=&quot;#dcdcaa&quot;<br>face=&quot;Consolas, Courier New, monospace&quot;&gt;<span style="white-space: pre; background-color: rgb(30, 30, 30);">Client recieving: </span></font>The client&nbsp;<br>is waiting for string messages from the server with&nbsp;<span style="color: rgb(220, 220, 170);<br>background-color: rgb(30, 30, 30); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;">listenForServerMessage. ServerThread helps<br>with this as well by sending individual messages from clients to the server<br>while the client is listening for server strings  </span></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201787768-8ee1f167-d939-41ec-932a-1a87a41687a2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I dropped the connection on the third terminal and the server is still<br>running.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/201787857-d8bda850-22b6-4d96-8e1f-9d83f690d70b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I disconnected a server and the remaining client that was connected disconnected and<br>stopped listening for input.  It is still running though.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>A socket has a flow of events and is used for client and<br>server interaction.&nbsp; It&#39;s usually from a client sending a message to the server<br>and then the client listening for a response for the server .&nbsp; When<br>a client disconnects the socket interaction is interrupted and that flow stops.<div><br></div><div>The client<br>does not crash because, while it knows that the server was disconnected and<br>to stop listening for the server the actual client program is still running<br>and will continue to run.</div><div><br></div><div>A server has multiple clients to receive messages from.&nbsp;<br>Just because one or more client will disconnect doesn&#39;t mean the server will<br>stop working.&nbsp; The server is designed to always be running until its terminated<br>, it is made for clients to be constantly connecting and disconnecting to<br>it.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/zaidfar/IT114-005/pull/7">https://github.com/zaidfar/IT114-005/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/zf5" target="_blank">Grading</a></td></tr></table>