# Selenyum-POM
Selenium Page Object Model Example.   
This project includes an automation script that automates the process of adding a product to the cart on the Kitapyurdu site and then deleting it, using Java and Selenium. This script has been shared on GitHub.  
## Contents
- [Features](#features)
- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Contribute](#contribute)
- [License](#license)

## Features
- Automatic opening to Kitapyurdu website
- Search for the specified product and add it to the cart
- View the product added to the cart
- Deleting the product in the cart

## Requirements
To run this project, the following software must be installed on your system:
- Java JDK 8 or later
- Maven
- Chrome WebDriver

## Setup
1. Clone this repository:
 ```sh
 git clone https://github.com/username/kitapyurdu-otomasyon.git
 ```
2. Go to the project directory:
 ```sh
 cd bookstore-automation
 ```
3. Install the required dependencies:
 ```sh
 mvn install
 ```

## Use
1. Open the `AddChartAndDelete.java` file located in the `src/test/java/tests` directory and fill in the required information:
 ```
 driver.get("https://www.kitapyurdu.com");
 ```
1.1. Open the `HomePage.java` file located in the `src/test/java/pages` directory and fill in the required information:
 ```
 findString = the book or author you want to search for
 ```
2. Use the following command to run the test:
 ```sh
 mvn testing
 ```

Once the test is complete, it will search for the specified product, add it to the cart, and then delete it from the cart.

## Contribute
If you would like to contribute, please open an issue first. Let's discuss your changes and contribute to the project.

1. Fork (https://github.com/yasingokce/Selenyum-POM/fork)
2. Create feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin property-name`)
5. Open a Pull Request

## Licence
This project is licensed under the MIT license - see `LICENSE` file for details.
