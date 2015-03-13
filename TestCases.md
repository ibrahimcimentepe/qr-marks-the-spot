# TEST CASES #

## Test Case 1a Registration Module ##
The user enters the website in order to register to the system.

<table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Sign Up" button from the main page</td>
<td>The page for registration which includes various text                                                                fields to enter personal details should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Enter "Seniye" in the user name section.</td>
<td>The name will appear as typed. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write "kimeniyetkimekismet" in the password section.</td>
<td>The password will appear in the following format:  </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Select 22 August 1989 from the calendar.</td>
<td>The selected date will appear in the corresponding<br>
section for "Birthday".</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Enter the URL: www.wish-let.com in the<br>
corresponding section.</td>
<td> The URL will appear as typed. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>Enter your Twitter id.</td>
<td>The id will appear as typed.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Enter your Facbook id.</td>
<td>The id will appear as typed.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Upload a picture by selecting from "Choose file"</td>
<td>The file name with its extension will appear.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>8</td>
<td>Click "Sign Up" button.</td>
<td>If the name "Seniye" is not in the database and                                                                               if the date you have chosen from the calendar is not a                                                                          future date, you will successfully sign up and be directed                                                                          to home page.</td>
</blockquote></tr>
</table></blockquote>

## Test Case 1b Registration Module ##
The user enters the website in order to register to the system. We assume that a user named Seniye is already registered.

<table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Sign Up" button from the main page</td>
<td>The page for registration which includes various text fields to enter personal details should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Enter "Seniye" in the user name section.</td>
<td>The name will appear as typed. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write "kimeniyetkimekismet" in the password section.</td>
<td>The password will appear in the following format:  </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Select 22 August 1989 from the calendar.</td>
<td>The selected date will appear in the corresponding section for "Birthday".</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Enter the URL: www.wish-let.com in the corresponding section.</td>
<td> The URL will appear as typed. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>Enter your Twitter id.</td>
<td>The id will appear as typed.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Enter your Facbook id.</td>
<td>The id will appear as typed.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Upload a picture by selecting from "Choose file"</td>
<td>The file name with its extension will appear.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>8</td>
<td>Click "Sign Up" button.</td>
<td>Once clicked, the user receives an error message indicating that a user with the same name already exists in the system.</td>
</blockquote></tr>
</table></blockquote>

## Test Case 2a Game Creation Module ##

Assume that the game creator Seniye has signed up and logged in to the system. Below is the test case for creating the game "Follow the Hints".

> <table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Create Game" button on the Home page</td>
<td>The page that includes text boxes that asks details about the game should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Write the name of the game, "Follow the Hints". in the text box "game name"</td>
<td>Since there is no game in the database with name "Follow the Hints", you should be allowed the enter the name "Follow the Hints"</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write the following text in the "description" text box: The person who first finishes the game will win a prize. Just go around and try to find the QR Codes.</td>
<td>The description should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Write the following text in the "Starting point of the game" text box: Bebek Starbucks</td>
<td>The start location info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Write the following into "Borders" text box: Bebek Starbucks - Arnavutkoy Belediye Tesisleri (along the seashore)</td>
<td>The border info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>Write the following tags one by one in the "tags" section: Bebek, prize, QR</td>
<td>The typed tags should appear in 3 consequent lines. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Write the following into "Number of steps in the game" text box: 4</td>
<td>The number typed should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>8</td>
<td>Click the "Next" button. </td>
<td> Once clicked next, the page that has the heading "You are designing the step 1" should appear.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>9</td>
<td>Write the "QR Code of The Step"as: "Who built the Bebek Mosque?".  Then write the "Location" as:"Bebek Starbucks Gate". Finally, write the "Password" as: "Architect Kemalletin"</td>
<td>The texts should appear as typed. </td>
</tr>
</blockquote></blockquote><blockquote><tr>
<td align='center'>10</td>
<blockquote><td>Click the "Proceed to Step 2" button. </td>
<td> Once clicked, the page that has the heading "Now you are designing 2" should appear.</td>
</blockquote><blockquote></tr>
<tr>
<td align='center'>11</td>
<blockquote><td>Enter the QR Code of The Step, Location and Password informations for step 2. </td>
<td> The texts should appear as typed. </td>
</blockquote></tr>
<tr>
</blockquote><td align='center'>12</td>
<blockquote><td>Click the "Proceed to Step 3" button.</td>
<td> Once clicked, the page that has the heading "Now you are designing 3" should appear. </td>
</blockquote><blockquote></tr>
<tr>
<td align='center'>13</td>
<blockquote><td>Enter the QR Code of The Step, Location and Password informations for step 3. </td>
<td> The texts should appear as typed. </td>
</blockquote></tr>
<tr>
<td align='center'>14</td>
<blockquote><td> Click the "Create The Game!" button.</td>
<td> The game will be created and you will be directed to the home page.</td>
</blockquote></tr></blockquote></blockquote>

</table>

The game is ready to be played.



## Test Case 2b Game Creation Module ##

Assume that the game creator Seniye has signed up and logged in to the system. Below is the test case for creating the game "Follow the Hints", where a game with the same name is already created.

> <table border='1'>
<blockquote><tr>
<blockquote><th align='left'>Steps</th>
<th align='left'>Actions</th>
<th align='left'>Expected Results</th>
</blockquote></tr>
<tr>
<blockquote><td align='center'>1</td>
<td>Click "Create Game" button on the Home page</td>
<td>The page that includes text boxes that asks details about the game should appear</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>2</td>
<td>Write the name of the game, "Follow the Hints". in the text box "game name"</td>
<td>Since there is no game in the database with name "Follow the Hints", you should be allowed the enter the name "Follow the Hints"</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>3</td>
<td>Write the following text in the "description" text box: The person who first finishes the game will win a prize. Just go around and try to find the QR Codes.</td>
<td>The description should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>4</td>
<td>Write the following text in the "Starting point of the game" text box: Bebek Starbucks</td>
<td>The start location info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>5</td>
<td>Write the following into "Borders" text box: Bebek Starbucks - Arnavutkoy Belediye Tesisleri (along the seashore)</td>
<td>The border info should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>6</td>
<td>Write the following tags one by one in the "tags" section: Bebek, prize, QR</td>
<td>The typed tags should appear in 3 consequent lines. </td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>7</td>
<td>Write the following into "Number of steps in the game" text box: 4</td>
<td>The number typed should appear in the relevant text box.</td>
</blockquote></tr>
<tr>
<blockquote><td align='center'>8</td>
<td>Click the "Next" button. </td>
<td> Once clicked next, an error message will appear saying that a game with the same name is already exists in the system. </td>
</blockquote></tr>