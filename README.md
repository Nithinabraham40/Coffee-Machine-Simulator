# Coffee Machine Simulator

The Coffee Machine Simulator is a Java-based application that simulates the functionality of a coffee machine. It allows an admin to manage ingredients, view available ingredients, and track daily cash collection. Users can view coffee types, prices, and purchase coffee if there are sufficient ingredients.

## Project Structure

The project follows the below structure:

- `CoffeeMachine` (abstract class): Provides a base for all coffee machines.
- `MyCoffeeMachine` (class): Extends `CoffeeMachine` and implements its abstract functions.
- `MyCoffeeDatabase` (class): Contains hardcoded data for the coffee machine.
- `CoffeeType` (enum): Defines the available types of coffee.
- `Admin` (class): Represents the administrator with privileges to manage ingredients and view analytics.
- `App` (class): Contains the main method where users and admin can interact.

## Tools and Technologies

- Programming Language: Java
- IDE: Eclipse

## Usage

1. Clone the repository or download the source code.
2. Import the project into Eclipse or your preferred Java IDE.
3. Build and run the `App` class.

## Features

### Admin Functionality

- Log in as an admin using the provided password.
- Add ingredients such as water, milk, and beans.
- View the available ingredients.
- Take daily cash collection after authentication.

### User Functionality

- View the available coffee types and their prices.
- Purchase coffee if there are sufficient ingredients.

### Analytics

- View an overview of the day's activities, including the total amount earned, ingredients left, and the number of coffees sold.

## Data Structures

- HashMap: Used to store and manage ingredient quantities.
- ArrayList: Used to store and retrieve coffee types and prices.

## Output
```
Welcome !!! Start your day with a coffee
Click 1 if yor are an Admin
Click 2 if you are a user
1
Enter the password
admin123
Click 1 for change password
Click 2 for view incredients
Click 3 for add incredients
Click 0 for main menu
3
Add Water
1000
add Beans
500
Add milk
500
ingredients added sucessfully
2
Water left=1000ml
Beans left=500units
Milk left=500ml
0
Click 1 for view coffeetype and price
Click 2 for money Collected
Click 3 for analytic
Click 4 for Exit
1
Click 1 for buy Espresso($4)
Click 2 for buy Latte($7)
Click 3 for buy Cappuccino($6)
Click 0 for Main menu
1
Thank you for buying EXPRESSO pay $4
2
Thank you for buying LATTE pay $7
3
Thank you for buying CAPPUCCINO pay $6
1
Insuffient Water
0
Click 1 for view coffeetype and price
Click 2 for money Collected
Click 3 for analytic
Click 4 for Exit
2
Enter admin password
admin123
Today's Collection is $17
3
Ingredients left:
Water=200
Milk=325
Beans=452
Today's Collection: $17
Total coffee sold today: 3
4
Thank you for using me
```

## Contributing

Contributions to the Coffee Machine Simulator project are welcome. You can contribute by:

- Reporting issues or bugs.
- Suggesting new features or enhancements.
- Submitting pull requests to fix issues or implement new features.


## Contact

For any inquiries or questions, please reach out to:

- Nithin Abraham: [abrahamnithin40@gmail.com]
