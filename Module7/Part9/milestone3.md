<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Zaid Farooqui (zf5)</td></tr>
<tr><td> <em>Generated: </em> 12/21/2022 8:52:25 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone3/grade/zf5" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208836103-9266745c-7b31-4363-8373-bab0c8ef52e0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows where you type in your username to connect, and shows the usernames<br>in the room on the top right of the chatbox<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208835931-c2da385c-4f54-4051-a11f-3b4590aa99f6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows the host and port for connecting <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>In the ClientUI.java file&nbsp;<div>*Uses public void connect() to input the username, host and<br>port</div><div>*private synchronized void processClientsConnectionStatus checks if the clients is connected to the chatroom<br>and if its not will add them,&nbsp; if they are connected already it<br>will disconnect</div><div>&nbsp;them so its not duplicated</div><div>*the event handlers on the bottom of ClientUI.java<br>will handle disconnects, connects, room joins and messages recieved&nbsp; etc. in the chatbox</div><div><br></div><div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208842303-2acf3718-cef0-482f-8e43-977523f8d7fd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Users in the room on top right of chatbox, you can see the<br>message area for chat history and also the message creation area and the<br>send button<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208846719-80097a1f-20d4-4a68-87ed-5f8bfd7c00ab.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows the code that makes pressing enter the same as pressing the &quot;send&quot;<br>button<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208847852-bb6d0334-b639-4de8-82f8-767b227ff89a.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I used /CoinFlip on &quot;zaid&quot; client and it shows that &quot;zaid&quot; triggered the<br>coinflip and the result of the flip on the other 2 clients in<br>bold letters<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208848445-e0c47d54-b433-48c3-af3a-06d8483d703f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I did &quot;/Roll 1d9&quot; to have 1 roll from 0-9 and the output<br>shows who triggered it and it is in bold lettering<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208853147-88c0b6a7-8efc-471e-aa1f-d59f40cb1353.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code for flip for milestone3, can see zf5 which is my<br>ucid in a comment<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208853740-332e90c9-93b0-4d70-93c9-11baa4cccc71.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code in Room.java for /Roll xdx   can see zf5<br>which is my ucid in a comment<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208854060-9595c79b-43ec-4821-840c-7d489f2d6f5d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code for how I got &quot;message&quot; to return as bold formatting,<br> it takes the &quot;message&quot; variable from Roll and Coinflip and returns it<br>with bold html tags, can see zf5 which is my ucid in a<br>comment<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>Explaining Roll:<div>The code will look for a message containing &quot;Roll&quot; and will remove<br>the word with ReplaceAll and then it will split the rest of the<br>message at the &quot;d&quot;.&nbsp; An array called &quot;sides&quot; is created that has how<br>many times you are rolling and up to which value of x you<br>are rolling up to.&nbsp; It will create an iterator and loop over the<br>serverthread objects in the clients list.&nbsp; If the clientid matches the clientID in<br>the serverthread it will enter a for loop that uses random.nextInt() to generate<br>the Roll.&nbsp; It then puts it in a variable and sends it to<br>&quot;changeMessageToBold&quot; which uses html tags change it to bold formating.</div><div><br></div><div>CoinFlip:</div><div>CoinFlip creates an iterator<br>for the clients list and loops over each serverthread.&nbsp; &nbsp;If the clientID matches<br>the clientID in the serverthread it will generate a random number between 0<br>and 1 that corresponds to heads or tails with random.nextInt().&nbsp; It will then<br>send the message to the bold formatting changeMessageToBold and return that.</div><div><br></div><div>The client &gt;<br>server&gt; client flow is how the iterator is created for the clients list<br>and then loops over each serverthread object in the list and then it<br>goes back to the client.</div><div><br></div><div><br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208880142-d4312179-88ab-4450-ac83-f1e139e359d1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>You can see the bold text in the chatbox on the 5th line<br>down, you can see italics on the 6th line down, you can see<br>colored on the 7th line down, you can see underlined on the 8th<br>line down, and you can see a combo of them all on the<br>last line down<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208880758-a7ef65c2-c250-42dd-a35c-aef3381c9a44.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>in the chat input area next to &quot;send&quot; you can see the input<br>I need to send the different formats<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>In ChatPanel.Java I had to change whereever JEditorPane was text/plain to text/html.&nbsp; So<br>that html tags would work for sentence formatting.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/208882274-876bf6ab-30a8-4905-94cd-1ecc6dc7e94e.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>zaid and bob are whispering each other with the @username command.  The<br>chatpanel with Kerry can&#39;t see the messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209008847-64de9f99-20c5-418e-89dd-0bfb8bce58ec.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In line 24 I made a command sent to user thats activated by<br>&quot;@&quot; which is how you start whispers<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209009173-0875ee05-8c21-4aa3-b2ed-d91958446345.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The highlighted shows the code of how whispers are processed <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209013008-a7478e8f-4f2a-4c9a-9390-409bec1ecfe0.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>the following code is how the whispers are sent to certain usernames<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>The code starts with an else if where basically if the message starts<br>with &quot;@&quot; (command_sent_to_user) and the message is after the @ then that code<br>will run.&nbsp; wasCommand is set to true which means that the following<div>code is<br>a command.&nbsp; The message is split into 2 with the &quot;@&quot; as the<br>delimiter into an array.&nbsp; The second element contains &quot;part1&quot; which contains the username<br>and message.&nbsp; part1 is then split into an array using space as</div><div>a delimiter,<br>the first element is the username which is the recipient of the message<br>and the second element is the message to be sent which is stored<br>in the sendMessage variable.&nbsp; The code then calls on the sendMessageToUser method which<br>sends the message to the specific username.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209016997-b95822b9-f3da-49b9-9a38-9cabc63ac882.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>You can see in the server terminal that one client has muted another<br>client (8) which is &quot;zaid&quot;.  The V client muted Zaid.  You<br>can also see that Zaids message did not show up on Vs chatpanel<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209017384-1bf8da87-71c7-48d0-acc4-5f4107c6db3b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>line 32 and 33 there are command triggers for mute and unmuting<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209020274-488f7e5c-de24-4888-94d1-f204674edfc2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>If the client is muted he will be added to the muted clients<br>arraylist.  If the client is unmuted he will be removed from the<br>arraylist.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/90267391/209020511-eda6aa29-c1dd-4de0-98a5-d02bb67f671b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>how mute and unmute works<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>The way that addClientToMutelist works is that&nbsp; it takes client and clienttoMute as<br>arguments.&nbsp; If mutedClients is null than it makes a new a new list<br>of muted clients.&nbsp; It will then add the client to the mutelist.</div><div><br></div>The way<br>that removeClientToMuteList works is that the method gets a list of muted clients<br>from mutelist, if the list is null than it makes a new list<br>of muted clients<div>It then removes the client to unmute from the list of<br>mutedClients&nbsp; and updates the muteList with the list of mutedClients.</div><div><br></div><div>isClientMuted uses 'client' and<br>'questionableClient" as arguments of long type.&nbsp; The method gets a list of mutedClients<br>from mutelist and if the list is null then the method returns false..<br>If the list is not null than it returns mutedClients.contain(quesitonableClient)</div><div><br></div><div><br></div><div>muteClient works by taking<br>client and ClientNameToMute as arguments.&nbsp; This method iterates through a list of clients&nbsp;<br>and checks if its equal to clientNameToMute. if it is then the method<br>calls addClientToMutelist.&nbsp; It also prints out a message in the terminal of which<br>client has muted the iterableClient</div><div><br></div><div><br></div><div>unmuteClient&nbsp; is almost the same as muteclient and iterates<br>through the list of clients and calls removeClientToMutelist&nbsp; if the client name of<br>the iterableClient is equal to the clientNameToUnmute.&nbsp; It also prints out a message<br>in the terminal of which client has unmuted the iterableClient</div><div><br></div><div><br></div><div><br></div><div><br></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/zaidfar/IT114-005/pull/13">https://github.com/zaidfar/IT114-005/pull/13</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-chatroom-milestone3/grade/zf5" target="_blank">Grading</a></td></tr></table>