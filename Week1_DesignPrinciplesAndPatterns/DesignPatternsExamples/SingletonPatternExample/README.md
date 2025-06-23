# Singleton Pattern Example

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. This is particularly useful for logging, configuration settings, or any resource that should be shared across the application.

## Implementation

In this example, we have implemented a `Logger` class that follows the Singleton design pattern. The `Logger` class contains:

- A private static instance of itself.
- A private constructor to prevent instantiation from outside the class.
- A public static method `getInstance()` that returns the single instance of the `Logger`.

## Testing

The `LoggerTest` class verifies the Singleton implementation by checking that only one instance of `Logger` is created and used throughout the application. It ensures that multiple calls to `getInstance()` return the same instance.

## Usage

To use the `Logger`, simply call `Logger.getInstance()` to obtain the single instance and use it to log messages as needed.