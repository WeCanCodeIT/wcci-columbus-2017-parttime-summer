1. Create a map for a restaurant's menu with the menu items and prices (use `double`) for the items as entries.

    |menu item|price|
    |---------|----:|
    |Spaghetti|$8.97|
    |Lasagna|$10.98|
    |Pizza|$15.50|
    |Caesar Salad|$7.00|
    |Kale Salad|$7.00|

    Stretch: Use `BigDecimal` and its `String` constructor rather than a double for prices.
  
1. Explore the commonly used map methods by solving the following problems. Display results to the console via `System.out`.

    - [ ] A customer insists that the bill is incorrect and that the menu listed the price of spaghetti at $7.97. Print the menu price of the spaghetti.
    - [ ] The restaurant owner is losing customers to the restaurant next door because customers want more menu options. Print the number of menu items, so the owner will know how many more items she needs to add.
    - [ ] Add a "Bottle of Champagne" that costs $200.00 and a "Bottle of Vintage Wine" that costs $175.00 to the menu. After adding each of these, print the item's price.
    - [ ] A prospective customer calls the restaurant because she's interested in planning a birthday dinner for her best friend. She is planning the budget and needs to know whether the restaurant offers champagne that could be purchased for the table. Print the boolean response returned from the method that checks to see if the "Bottle of Champagne" key exists.
    - [ ] The ink on a customer's bill smeared from water spilled on the table. The customer can't tell whether the bill says an item was $13.50 or $15.50. Print the boolean response returned from the method that will check to see if $13.50 is a price on the menu.
    - [ ]  There's a been a recall on the fresh kale sourced for the restaurant due to a rare invasive fungus that could make customers ill. Remove "Kale Salad" from the menu. Print a response showing that is no longer on the menu.
    - [ ] The owner and chef have decided to do a complete revamp of the menu. Clear the menu, removing all of the items and their prices, so they can have a fresh start. Before the chef and owner begin entering new items and prices, they ask you to double check that all items were removed. Print the boolean response returned by the method that will check to see if the menu is clear.
