# Pizza Patterns

Pizza Patterns is a computer program that builds pizza orders “on the fly” so to speak with the use of factory design pattern and decorator design pattern. Starting with a base pizza of either small, medium, large or “family” size (pricing below), the program allows the cashier to add any ingredient (or even double ingredients) to the base order. Or course, each ingredient costs an additional amount and changes the description of the pizza being ordered. The program prints a description and a total price for the pizza. 

The base costs are:
	1. Small, $8.00
	2. Medium, $10.00
	3. Large, $12.00
	4. Family, $16.00

The base cost covers crust, sauce and cheese. Additional ingredients are:
•	(P)epperoni, $2.00
•	(S)ausage, $2.00
•	(H)amburger, $2.00
•	(C)anadian Bacon, $2.75
•	(E)xtra cheese, $1.85
•	(O)nions, $1.50

Examples. 

A small pepperoni with extra cheese prints:
Order: Small with pepperoni, extra cheese - $11.85
            2 ingredients
End order

I want a large pizza topped with pepperoni, sausage, extra cheese, onions, beer and beer, the program prints:
Order: Large with pepperoni, sausage, extra cheese, onions, beer, beer - $25.85
            6 ingredients
End order


## What I used?

- Java
- Factory design pattern
- Decorator design pattern


