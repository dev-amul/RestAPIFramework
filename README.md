# API Testing Framework using RestAssured, TestNG, Maven, and Allure

This is a comprehensive framework for automating REST API testing using Java-based tools and libraries like RestAssured, TestNG, Maven, and Allure Report. The framework is designed to validate API endpoints through functional and security testing while also generating interactive and detailed reports.

## Overview

This API Testing project:
- Demonstrates how to perform CRUD operations with REST APIs
- Uses RestAssured for HTTP request automation
- Applies TestNG for organizing and executing test cases
- Integrates Allure Report for advanced test reporting
- Enables scalable and maintainable test structure

## Architecture

The framework includes:
- A test suite powered by TestNG
- RestAssured classes for sending HTTP requests
- Utility classes for payload and JSON handling
- Configuration through Maven POM
- Reporting mechanism via Allure Report CLI

## Tech Stack

- Programming Language: Java
- Testing Library: RestAssured
- Test Framework: TestNG
- Build Tool: Maven
- Reporting: Allure Report
- IDE: IntelliJ IDEA or Eclipse
- Version Control: Git
- OS Compatibility: Windows

## Setup Instructions

To run the project, complete the following setup:

1. Install Java and configure system environment variables
    - Check with java --version and javac --version

2. Install Maven and configure the system path
    - Check with mvn --version

3. Install an IDE (IntelliJ IDEA or Eclipse)
    - Eclipse: https://www.eclipse.org/downloads/packages
    - IntelliJ: https://www.jetbrains.com/idea/download

4. Install Git
    - Download: https://www.git-scm.com/downloads

5. Clone the project using the following command
   git clone https://github.com/dev-amul/RestAPIFramework.git

6. Open the project in your IDE and run Maven install via the POM file

## Allure Report Setup

To generate HTML reports:

1. Install Scoop package manager
    - Run PowerShell command
      Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser

2. Install Node.js using Scoop
   scoop install nodejs

3. Install Allure CLI
   scoop install allure

4. Verify installation and check https://allurereport.org/docs/gettingstarted-installation for help

## Running the Tests

Use Maven to run the test cases
mvn clean test

## Generating and Viewing Allure Reports

After running tests, Allure generates results in the target/allure-results directory.

Use the following command to serve reports:
allure serve path/to/target/allure-results

Alternatively, you can use:
mvn allure:serve

Note: Ensure you update the path as per your local project directory.

## Features

- Supports CRUD operations on APIs
- Demonstrates multiple authentication types
- JSON data extraction and validation
- JSON modification and comparison
- File upload testing
- Data encryption and decryption tests
- Easy integration and configuration via Maven

## Test Coverage

The framework includes test cases for:

- POST: Create a user
- GET: Fetch user list and single user data
- PUT: Update user details
- PATCH: Partial update on user
- DELETE: Remove user by ID

Authentication Types Tested:
- Basic Authentication
- Digest Authentication
- OAuth and OAuth2 Authentication
- Preemptive Authentication

JSON Data Manipulations:
- Add new key or value
- Replace existing keys or values
- Extract single and multiple values
- Insert arrays and objects
- Compare JSON files
- Encrypt and decrypt payloads

Advanced Tests:
- File Upload
- Extract and verify key-based JSON data


