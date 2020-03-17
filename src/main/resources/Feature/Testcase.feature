Feature: OpenCart application
@tc01_Register 
Scenario: 
Given the Opencart application opens in chrome browser
When the user clicks on register
Then the user fills all the details
And the user clicks on submit 
@tc02_Validlogin
Scenario:
Given the application opens in browser
When the user clicks on Login
Then the user gives valid credentials
And clicks on Login button
@tc03_InvalidLogin
Scenario:
Given the application will open in chrome browser
When the user clicks on login
Then the user tries to login with invalid details
And click on login button
@tc04_MandatoryFields
Scenario:
Given the application opens in chrome browser
When the user clicks on register button
Then the user fills the details by leaving one mandatory field
And clicks on submit button
@tc05_Links
Scenario:
Given the application opens
When the user login to the application
Then the homepage opens
And get all the links in that page

@TC06_AddtoCart
Scenario:
Choose the product and add to cart
Given the url opens in Chrome application
When the user clicks on phones 
Then the user selects the product
And clicks on add to cart

@TC07_Checkcart
Scenario:
check the cart
Given url opens in chrome browser
When the user clicks on Cart option
Then the user checks the product
And confirms the product we added is present or not

@TC08_priceupdate
Scenario:
when increasing the quantity whether the price is updating or not
Given the url open in chrome browser
When user click on cart option
Then increase the quantity of the product
And click on refresh button


@TC09_storingProductDetails
Scenario:
The product details are stored in excel
Given url open in chrome browser
When the user clicks on cart option
Then clicks on the selected product
And store the product name into excel

@TC10_RemovefromCart
Scenario:
Remove the product from cart
Given the url opens in the chrome browser
When the user click on cart option
Then  user selects the product
And clicks on remove

@tc11_selectingitem
Scenario:
select an item in desktop
Given the user launched the chrome browser
When the user opens the OPenCart homepage
Then the user select desktop
And the user select on the item 
@tc12_shownumber
Scenario:
select the number of items to be shown
Given the user launched the chrome 
When the user opens the OPenCart 
Then the user select desktop icon
And the user selects the number
@tc13_sorting
Scenario:
sorting the number of elements
Given the user launched the chrome window
When the user opens the OPenCart page
Then the user select desktop iccon
And the user selects the type of sorting
@tc14_storetoexcellsheet
Scenario:
storing the details to excell sheet
Given the user launched the chrome page
When the user opens the OPenCart window
Then the user select desktop button
And the user adds the details of items to excelsheet
@tc15_storetowishlist
Scenario:
adding to wishlist
Given the user launched the chrome session
When the user opens the OPenCart windowpage
Then the user select desktop buttonclick
And the item to wishlist


@tc_16
Scenario: Search Functionality
Given the user launches the chrome browser and opens application
When the user searches for the product
And Clicks on Search button
Then the user should see search results

@tc_17
Scenario: Filter
Given the user launches the chrome browser & opens application
When the user searches the his product 
And Clicks on Search button, Selects the the sort by filter
Then the user should see modified results

@tc_18
Scenario: Products to Excel
Given the user launches the opens chrome and Application
When the user searches for products
And Clicks on Search Button
Then user should see results

@tc_19
Scenario: Comparision Screenshot
Given the user launches the opens chrome & Application
When the user searches for products on Application
And Clicks on search button
Then Compares two products
And the user should see results

@tc_20
Scenario: List View
Given the user launches the opens chrome & application
When the user searches for products on application
And Clicks on search button and click on List View
Then Results should be viewed in List View
