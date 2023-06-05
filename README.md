# Prime Number Generator

This is a simple Java application that generates a list of prime numbers within a given range. It provides a command-line interface for users to input the range and view the resulting prime numbers.

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.
- JUnit and Hamcrest libraries for running the unit tests. These libraries should be available in the classpath.

### Running the Application

1. Clone the repository to your local machine: 
  `git clone https://github.com/pruthvi-dudam/PrimeNumber-generator.git`

2. Open a command prompt or terminal and navigate to the project directory:
  `cd PrimeNumber-generator`

3. Compile the Java source files:
  `javac src/com/primeNumberGenerator/*.java -d out/` <br>
  or <br>
  `javac src/com/primeNumberGenerator/PrimeNumberGenerator.java src/com/primeNumberGenerator/PrimeNumberGeneratorApp.java src/com/primeNumberGenerator/PrimeNumberGeneratorInterface.java -d out/`

4. Run the application:
  `java -cp out/ com.primeNumberGenerator.PrimeNumberGeneratorApp`

5. Follow the on-screen instructions to use the application. You can input the range of prime numbers or quit the application.

### Examples

- To generate prime numbers from 1 to 20, input the range as follows:
Please input the range (starting value and ending value):<br>
1 <br>
20

- To quit the application, select option 2 when prompted.

### Running the Unit Tests

1. Ensure that you have compiled the Java source files as mentioned in the previous section.

2. Compile the test file: 

- Please replace `/path/to/junit.jar` and `/path/to/hamcrest-core.jar` with the actual paths to the JUnit and Hamcrest JAR files on your system. Additionally, make sure to mention that the user needs to have these libraries available in their classpath for running the unit tests.

- `javac -cp "out/:/path/to/junit.jar:/path/to/hamcrest-core.jar" -d out/ test/com/primeNumberGeneratorTest/PrimeNumberGeneratorTest.java`
 
 3. Run the test file:
  `java -cp "out/:/path/to/junit.jar:/path/to/hamcrest-core.jar" org.junit.runner.JUnitCore com.primeNumberGeneratorTest.PrimeNumberGeneratorTest`

This application is compatible with Windows, macOS, and Linux operating systems.



