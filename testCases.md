# TEST CASES #

## Test Case 1 Using Game Search Module ##
First of all let us assume that the user whose name is "Zeynep" is already signed in to our system. Note that the sign in and sign up processes are described in other test case scenarios. Also let us assume there are already some games created in the database. One of these games is called “South Campus”. Also there is no such game in the database named as “North Campus”. After these assumptions using game search module to find and play a game is as follows:

<table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Search Game" button from the main page</td>
<td>The page for searching games which includes a text field to write the keywords and a search button should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Write keywords North Campus with quotation marks so that it will be searched exactly as it is</td>
<td>Since there is no game in the database with name "North Campus", you should see no games found with keywords "North Campus"</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write keywords North Campus without quotation marks so that all the games containing north and campus keyword will be searched</td>
<td>You should see all the games including north and campus words in their names. In our case you should be able to view the game named "South Campus"</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Write keywords South Campus with quotation marks so that it will be searched exactly as it is</td>
<td>You should see the game named as "South Campus".</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Click to the game "South Campus"</td>
<td>You should see its details which are entered by its creater</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>From game details page click "Play" button</td>
<td>You should see the first clue or QR Code location to start the game</td>
</blockquote></tr>
</table></blockquote>

After the last step Zeynep can play the game as it is described in the play game test scenario.

## Test Case 2 ##
Assume that the game creator Seniye has signed up and created a profile page as a "game creator". Below is the test case for creating the game "Conquer the south campus".

> <table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Create a new game" link on the profile page</td>
<td>The page that includes text boxes that asks details about the game should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Write the name of the game, "Conquer the south campus". in the text box "game name"</td>
<td>Since there is no game in the database with name "Conquer the south campus", you should be allowed the enter the name "Conquer the south campus"</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write the following text in the "description" text box: This game is designed to give an orientation about south campus of Bosphorus University</td>
<td>The description should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Write the following text in the "borders" text box: All the qr codes of this game are located inside the south campus of Bosphorus University"</td>
<td>The border info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Write the following into "start location" text box:The first qr code is located on engineering faculty's building</td>
<td>The start location info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>Click the "Create Game" button</td>
<td>It is checked if there are any empty field or not. SInce there are none, passwords and qr spots" page is opened. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Write the number "4" into the text box that asks for the number of steps planned for the game and click the "next" button</td>
<td> Once clicked next, 4x2=8 new textboxes are created under the page for each step; and these text boxes stand for the fields where you will enter the password of each step and the location of each step's qr code.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>8</td>
<td>Write the "Location of qr code for step 1"as: "Engineering faculty building" Password of step 1 = "12345abc". Repeat this for the following 3 steps, and click "finish creating the game button". </td>
<td>It is checked if there are any empty field or not. SInce there are none, the game is created in the main page. </td>
</tr>
</table></blockquote></blockquote>

The game is ready to be played.

## Test Case 3 ##

Assume that the game creator Seniye has has logged in, opened her profile page and wants to delete one of the games she has created. Below is the test case for deleting the game "Conquer the south campus".

> <table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "My games" link on the profile page</td>
<td>The page that includes the games you have created should appear in a list.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Click on the game, "Conquer the south campus".</td>
<td>The options "edit" and delete" will appear. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Click on the button "delete". </td>
<td>The game "Conquer the south campus" will be deleted.</td></blockquote></blockquote></li></ul>

</tr>
</table>

The game will be deleted from the database.