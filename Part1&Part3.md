# Part 1: Exploratory testing - Booking a stay in a hotel

## Test Scenario1
*Area:Login Functionality*
- Login as given correct Username and Password
- Try to log in without  Username and Password
- Try to log in without Username and wrong Password
- Try to log in without Password and wrong Username
- Try to log in with wrong Password and wrong Username
- Check  the functionality of forgot password and signup button.

*Area: GUI Checking*
- Check color combination of the elements
- Check position and size of the elements
- Check image Quality
- Check text size and color of the elements
- Check accessibility of the website.
- Check responsibility of the website.

### Testing Notes Login Functionality

*Area:Login Functionality*
- Successfully logged in with given credentials and verified welcome message.
- Successfully verified warning messages with various wrong credentials options.
- The sign up and forgot password option worked properly.

*Area: GUI Checking*
- The width of input area and buttons considerably long.
- The text color of some buttons are  in low contrast and not bright.
- Accessibility of the web page could be better.
- Responsiveness of the website could be modified. Especially the width of the buttons for different screen size.
- Hovering color especially in footer part is not nice. Another color can be used.
- Text size and text format could be changed.

## Test Scenario2

*Area:Entering valid fields to book a hotel.*
- Check input field of hotel search by entering location name and hotel name also.
- Select valid check-in check-out i date .
- Check  adults and children number part by clicking (-) and (+) button
- Click  search button to see result of search functionality.

*Area: GUI Checking*
- Check color combination of the elements
- Check Position and size of the elements
- Check image Quality
- Check Text size and color of the elements.
- Check Functionality of buttons.

###Testing Notes of Entering valid fields to book a hotel.

*Area:Entering valid fields to book a hotel.*
- Successfully hotels found  with the hotel name and city name
- Entering check-in and check-out date was successful.
- Check-in and check-out are could be more strict. It allows to send key. Because first element is input field.

*Area: GUI Checking*
- Modifying and  selecting room from listed room.
- The appearance of input parts  are nice.
- Just sometimes because of the slider on background and one photo(mountain), the search button is shadowed.
- The quality of the photos could be improved.

##Test Scenario3

*Area:Modifying and  selecting room from listed room.*
- Check the functionality of selecting room and number of room
- Check the functionality of Modifying parts
- Check  the functionality of Booking button

*Area: GUI Checking*

- Check color combination of the elements
- Check position and size of the elements
- Check image Quality
- Check text size and color of the elements.
- Check functionality of buttons.

###Testing Notes of modifying and selecting room from listed room.

*Area:Modifying and  selecting room from listed room.*
- Rooms and numbers of room selected successfully.
- By clicking modified button dates and other inputs successfully changed.
- When clicked booking button without selecting and room no warning message appeared.

*Area: GUI Checking*
- The  booking button is so wide.
- The text color of booking button is not accessible.
- Accessibility of this part could be improved.
- Responsiveness of the page is nice.
### Bugs and issues to consider
Bug:Name of the location for some Turkish hotels are wrong. It shows another city name.
 Priority: medium
/Severity:low

- Login part, functionality of hotel search, booking and payment is priority of booking hotel part.
- The first hotel option with default dates gave loading error. The images and some information
about the hotels not retrieved.
- When booking button clicked without selecting and room no warning message appeared.
- Password requirement could be improved. More strong password options.
- Size of the buttons can be arranged. Especially width.
- Color of hovering options could be improved. Especially in footer part.
- In the hotel search option one photo inside the slider can be  changed. Mountain image.
- Calendar part can be modified. 


#Part 3: Reflection on the automation exercise

- We simply tried to do smoke and functional testing as part of system testing.
- Smoke testing is very important to check the main functionality of the application 
or web page regulary.
- We also did a kind of black box integration testing because we dealt
with two different part or module, login module and hotel booking module.
- We tried to check the workflow of booking hotel part as a user.
- It is %100 difficult to do automation testing to check all aspects of page.
- Especially accessibility of the page can be done through manual testing and documentation
  but with cypress automation tool it is for some aspect possible. 
  







 




