# java-custom-exception-handler
A robust calculator implementation demonstrating custom exception handling and input validation through user-defined Exception classes.

The Goal: To build a functional arithmetic engine that goes beyond basic calculations by implementing a custom error-reporting layer. The goal was to ensure the application could distinguish between mathematical errors (like invalid operations) and data entry errors (like negative numbers).

The Challenge: Standard Java exceptions are often too generic for specific business logic. The challenge was to create specialized error types that provide the end-user with clear, actionable feedback when they enter an invalid character or a prohibited negative value.

The Solution: I extended the base Exception class to create CustomValidationException and InvalidOperationException. By using the throws keyword and throw new logic within the Calculator class, I created a predictable error handling flow that protects the application's stability.
