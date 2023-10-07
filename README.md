Welcome to my MakeChange project!!

Here is an overview on how the program works.

The program will begin by asking the user (cashier) to enter the price of the item.
The program will then prompt the user to enter the amount of cash given by the customer.

If the customer did not give the cashier enough money, the program will print an error message to ask the customer for more money

If the customer gave exact change, the program will let the cashier know no change is due.

If the customer gave the customer more money than the price. The program will display a message to let the cashier know the change due. The program will also display the exact denominations and coin to be returned to the customer.

They program works by using a scanner to receiver input from the cashier. Using 3 variables to represent the price (price), the amount tendered (cashIn), and the change due (cashOut), the program will calculate the change due by taking the difference of the amount tendered and the price of the item.

The program will then compare the amount tendered and the price. Depending on the scenario, the program has 3 'if' statements that will trigger a print out for the cashier to act upon.

The program will then take the difference (cashOut) and display the denominations and coin the cashier needs to provide the customer. This works by using several 'if' statements. The difference is first divided by 20. If the division is greater than or equal to 1, the program will cast the double (cashOut) into an integer and check for a remainder using a modulus statement. The program will then printout the remainder if there was one. If there was not a remainder, or if the difference / 20 was less than one, the 'if' statement will never trigger.

The program will continue to do this will all denominations and coin ($10, $5, $1, .25c, .10c, .05c, .01c) in the same manner described above with minor differences (i.e. $10 is cashout /10, $5 is cashOut/5, etc).

Enjoy!!