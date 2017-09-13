## Girl Scout Cookie Order

We have all been there, the irresistible face of a cute kid selling tasty cookies. They're everywhere...
at the store, knocking on the door, in the parking lot...
Your objective is to create an ArrayList project that keeps track of the variety of cookie you ordered and the quantity. You will also
keep track of your total number of boxes purchased. You are going to give the program the ability to remove a variety from the list
just remember this may make the girl scout sad so please be kind.

### The `CookieOrder` Class
- Write this class to keep track of 2 pieces of instance data: `variety` of cookie and `numBoxes` purchased
- Create the constructor to handle this data and 2 accessor methods

### The `MasterOrder` Class will maintain a list of cookies being purchased
- Declare your ArrayList and name it `orders`
- Create an empty constructor and the following methods
- `public void addOrder(CookieOrder theOrder)` add an order to the list showing variety and quantity
- `public int getTotalBoxes()` keep track of total boxes ordered
- `public int removeVariety(String variety)` give the ability to pick out a variety of cookie and remove
   it from the list (keep track of total boxes removed as well) Hint: When you remove something the list will shrink, 
   you need to consider this when traversing your collection (you don't want to overlook any items)
- `public void showOrder()` to traverse and print the ArrayList

### The `OrderApp` Class 
- Add 4 orders
- Total the boxes purchased
- Show the list
- Remove a variety and give feedback on how many boxes were removed
- Show the updated list

### Example
```bash
Current Order
Variety: Tagalongs Boxes: 1
Variety: Thin Mints Boxes: 5
Variety: Samoas Boxes: 2
Variety: Tagalongs Boxes: 3
 
You have ordered 11 boxes

What would you like to remove? (specify a variety or none)
Thin Mints
You are removing 5 Thin Mints
Current Order
Variety: Tagalongs Boxes: 1
Variety: Samoas Boxes: 2
Variety: Tagalongs Boxes: 3
```

### Stretch Task
- Try doing live adds, removals and updates to your order, you will need a loop and some user input

### Stretchier Task
- Specify a variety of cookie you want to remove and exactly how many boxes need to be removed
  (now you are dealing with 2 parameters(requirements))
