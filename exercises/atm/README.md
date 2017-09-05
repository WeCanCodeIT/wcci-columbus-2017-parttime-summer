# ATM

## Objective

Design an `Atm` class and an `AtmClientApp` (with a `main` method) to simulate access and transactions that occur with an ATM (**A**utomatic **T**eller **Machine**).  The ATM should require the user to enter a 4 digit PIN (**P**ersonal **I**dentification **N**umber) to gain access.

### Tasks

Complete the following tasks in the given order, finishing one before moving on to the next (excepting stretch tasks).

Where these instructions mention prompting the user or displaying information, this should be done via console. Also, all of the console input/output should be done from the `AtmClientApp` class.

#### Require a PIN for access

Your `Atm` class should have:

- an *instance variable* of type `String` called `requiredPin` that holds the PIN required to gain access.
- a *method* with the signature `boolean allowAccess(String enteredPin)` that checks to see whether a PIN the user entered is valid.

Your `AtmClientApp` class should:

- create an instance of `Atm`.
- prompt the user for a PIN number via the console.
- display either a success or failure message based on the PIN the user entered.

##### Stretch Task

- Create a *constructor* that allows the required PIN to be specified during object construction.

#### Allow deposits

Add the following to your `Atm` class:

- an *instance variable* of type `double` called `balance` that stores the user's account balance. Feel free to initialize this with an arbitrary beginning balance.
- a *method* with the signature `void deposit(double amount)` that increases the value of `balance` by `amount`.

Add the following to your `AtmClientApp` class (these are all predicated on the user having entered the correct PIN):

- display a menu, with only one option for now: `Press 1 to deposit funds`.
- prompt the user to select an option. So long as she selects anything other than `1`, redisplay the menu.
- prompt the user for a deposit amount.
- call the `deposit` method on `Atm` to deposit the amount specified.
- display the current account balance.

##### Stretch Task.

- add the beginning balance to the `Atm` *constructor*.
- use `java.math.BigDecimal` to store balance instead of `double`.

#### Allow withdrawals

Add the following to your `Atm` class:

- a *method* with the signature `void withdraw(double amount)` that decreases the value of `balance` by `amount`.

Update your `AtmClientApp` to:
- offer a `Press 2 to withdraw funds` option.
- prompt the user for a withdrawal amount.
- call the `withdraw` method with the specified amount.

#### Allow balance inquiries.

Update your `AtmClientApp` to:
- offer a `Press 3 to check balance` option.
- display the current balance when this option is chosen. 

#### Input loop

Update your `AtmClientApp`, adding a `Press 4 to exit` option. Keep prompting the user to select an option until they enter `4` to exit, then print a goodbye message.
## Examples

```bash
Welcome to Bank of We Can Code IT ATM.
Please enter your PIN:
1234

What would you like to do next?
 Press 1 to deposit funds
 Press 2 to withdraw funds
 Press 3 to check balance
 Press 4 to exit

4
Thank you. Have a nice day!
```
