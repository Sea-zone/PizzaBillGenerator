# Pizza Bill Generator

Pizza Bill Generator is a simple Java program for generating bills for pizza orders. It allows customers to order pizzas with options for adding extra cheese, extra toppings, and choosing to take away the pizza.

## How to Run

To run the program, follow these steps:

1. Make sure you have Java installed on your system.
2. Compile the Java files using any Java compiler. For example:
3. Run the compiled program using the `java` command:


## Features

- **Base Pizza**: You can order a basic pizza with options for vegetarian or non-vegetarian.
- **Extra Cheese**: Add extra cheese to your pizza for an additional cost.
- **Extra Toppings**: Add extra toppings to your pizza for an additional cost.
- **Take Away Option**: Choose to take away your pizza, which incurs an additional cost for packaging.

## Directory Structure

The source code is organized into the following files:

- `Main.java`: Main class containing the `main()` method to run the program.
- `Pizza.java`: Class representing a basic pizza with methods to add extra cheese, extra toppings, and for take away.
- `DeluxePizza.java`: Subclass of `Pizza` class representing a deluxe pizza with default extra cheese and extra toppings.

## Usage

- Create an instance of `Pizza` or `DeluxePizza` class.
- Use appropriate methods to customize your pizza (e.g., `addExtraCheese()`, `addExtraToppings()`).
- Call `takeAway()` method if you want to take away the pizza.
- Finally, call `getBill()` method to get the bill including all charges.

## Example

```java
public static void main(String[] args) {
 DeluxePizza dp = new DeluxePizza(true);
 dp.takeAway();
 dp.getBill();
}
This will create a deluxe vegetarian pizza, add extra cheese and toppings, opt for take away, and print the bill.

Contributions
Contributions are welcome! Feel free to open an issue or submit a pull request with any improvements or additional features you'd like to see.
