# java-custom-exception-handler
A comprehensive Java error-handling framework demonstrating custom Exception hierarchies, behavioural validation, and state-based error codes for financial simulations.

The Goal: To demonstrate a sophisticated approach to error handling in Java by building a "defensive" code layer. The system is designed to identify and manage specific data failures, such as unauthorized account access or invalid mathematical operations, ensuring application stability.

The Challenge: Standard Java exceptions are often too generic to describe specific business logic failures. The challenge was to design a custom exception architecture that could carry unique metadata, such as Error Codes, to provide precise debugging information in a simulated enterprise environment.

The Solution: I implemented two distinct validation patterns: 
  - Logic Validation: Utilizing CustomValidationException and InvalidOperationException to catch illegal inputs (like negative values) before they reach the calculation engine.
  - State Based Validation: Implementing a robust AccountException that stores integer error codes. This allows the AccountExampleTest driver to catch specific failures and report them with high granularity, mimicking real world financial software behaviour.
