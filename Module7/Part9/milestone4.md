<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 12/22/2022 3:08:19 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone4/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209202299-e220e491-4dd3-4330-a1af-7674be8002e5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>you can see the export button next to the send button on the<br>chatbox<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209202299-e220e491-4dd3-4330-a1af-7674be8002e5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>i exported the chat into chat.txt and you can see the whole got<br>got exported as a string and even the html formatting tags were exported<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>in ChatPanel.java I made a button for &quot;export&quot;.&nbsp; &nbsp;The export method used is<br>called exportChathistory&nbsp; and it begins by creating JFileChooser which allows the user to<br>select a file to save.&nbsp; FileNameExtensionFilter specifies the file being saved should be<br>a text file&nbsp; and showSaveDialog displays the file chooser to the user.&nbsp; When<br>the user clicks a file to save into &quot;message&quot; which is the conversation<br>is saved into the file object selected before.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209203629-46f8c8e9-8ede-42c9-b536-f88786fe46e1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I made a file called MuteController.java and the mutelist is stored in a<br>variable called &quot;muteList&quot;<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209204075-1a044ef2-9acb-4638-8dbd-78d585a4a3d3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Clients are getting added and removed to muteList in the screenshot server side<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209204249-22c7c919-581d-45b1-9775-fe46095a8321.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The methods used in the highlighted code iterate through the connected clients <br>for the muting feature<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209208439-c12e63f3-157d-43e8-9c03-bd054dfb2bb2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>mute unmute, isclientmuted, in server.java<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>in Room.java muteClient and unmuteClient are used for muting and unmuting through a<br>list of clients server side.&nbsp; muteClient works by creating an iterator of the<br>clients list which is a list of ServerThread objects&nbsp;<div>of connected clients.&nbsp; The iterator<br>than goes through the list of clients.&nbsp; The method checks if each client<br>is equal to clientNameToMute, if it is equal then&nbsp; than the server is<br>updated to reflect that.&nbsp; The unmuteClient works in a similar way.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209209789-a1e83f54-e9cd-4af1-9dfa-7fdae8d1221c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows that client &quot;bob&quot; got muted by &quot;zaid&quot; client.   Bob&#39;s client<br>informs him that he has been muted by zaid Bob is talking and<br>the client &quot;zaid&quot; is on cannot see his messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209210808-4b4b3860-4e06-45c8-a89e-7b73ff0888ba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the highlighted text is where the message occurs from<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>these methods first take a single argument which is the username of the<br>client that made the mute or unmute command.&nbsp; A payload is created and<br>the payloadtype is set to Type.Mute.&nbsp; setMessage is called to set the message<br>of the payload to a string .&nbsp; Next the send method is called<br>and the message that the user has been muted by the other user<br>is sent.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209211996-e0bd86de-cb78-450a-9ce7-35d0a3748322.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>you can see in the users list in the chatboxes, the greyed out<br>users are those that are muted to the client.  Each client has<br>different muted users. Bob is muted to Zaid.  Perry is muted to<br>Bob<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209212677-dab4b24c-2603-461e-a0cc-ee35874a6136.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>i unmuted all the users, Zaid was the last person to talk in<br>the chat and he is highlighted in all the chatrooms as the last<br>person to speak<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209212866-80ce1867-4352-4847-9c59-e16b8e7ad129.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Now bob is the last person to speak and he is the person<br>highlighted in all the chats<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209213070-87f1f650-26fc-48b8-96f2-5c732c3a70a5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I muted perry in Zaids chat so that Bob is still the last<br>person to speak for him and bob is highlighted for him.  But<br>for the rest that don&#39;t have Perry muted he is the last to<br>speak and is highlighted.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209217125-04143dfe-1965-4b4f-849c-ab638d5213c2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The method that highlights the username of the last speaking person<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>The mute change color worked in a similar way to high getting the<br>&quot;you have been muted&quot; muted message was sent with payloads.<div><br></div><div>For the last person<br>speaking they are highlighted.&nbsp; Everytime a user receives a message, the method onMessageRecieve<br>will be executed in ClientUI.java. Then with highlightUsername the name will become highlighted.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone4/grade/zf5" target="_blank">Grading</a></td></tr></table>