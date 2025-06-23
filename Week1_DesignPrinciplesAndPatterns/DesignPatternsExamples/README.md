# Design Patterns Examples

This project showcases various design patterns implemented in Java. Each design pattern is organized into its own directory, containing relevant classes and test files to demonstrate its functionality.

## Patterns Included

1. **Singleton Pattern**
   - Ensures a class has only one instance and provides a global point of access to it.
   - Example: Logger class.

2. **Factory Method Pattern**
   - Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.
   - Example: Document creation (Word, PDF, Excel).

3. **Builder Pattern**
   - Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
   - Example: Computer configuration.

4. **Adapter Pattern**
   - Allows incompatible interfaces to work together by converting the interface of a class into another interface that a client expects.
   - Example: Payment processing with different gateways.

5. **Decorator Pattern**
   - Adds new functionality to an object dynamically without altering its structure.
   - Example: Sending notifications via multiple channels (Email, SMS, Slack).

6. **Proxy Pattern**
   - Provides a surrogate or placeholder for another object to control access to it.
   - Example: Image loading with lazy initialization and caching.

7. **Observer Pattern**
   - Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   - Example: Stock market monitoring.

8. **Strategy Pattern**
   - Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
   - Example: Payment methods (Credit Card, PayPal).

9. **Command Pattern**
   - Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
   - Example: Home automation commands.

10. **MVC Pattern**
    - Separates an application into three main components: Model, View, and Controller.
    - Example: Managing student records.

11. **Dependency Injection**
    - A technique in which an object receives its dependencies from an external source rather than creating them itself.
    - Example: Customer management service.

## Usage

Each pattern can be explored in its respective directory. The README files within each pattern's directory provide further details on the implementation and usage of that specific pattern. 

Feel free to explore the code and test the implementations to gain a better understanding of each design pattern.