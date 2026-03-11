# BDD REST Assured API Automation Framework

## Overview

This project is a **BDD-based API Automation Framework** developed using **Java 21 (Amazon Corretto)**, **Rest Assured**, **Cucumber**, **JUnit**, and **Maven**.
It is designed to automate REST API testing using Behavior Driven Development (BDD) approach and generate detailed test reports.

## Tech Stack

* Java 21 (Amazon Corretto)
* Rest Assured
* Cucumber (BDD)
* JUnit
* Maven
* Jenkins (CI/CD)
* GitHub

## Features

* BDD approach using Cucumber feature files
* API testing using Rest Assured
* Test execution using JUnit
* Maven build management
* JSON & HTML reporting
* Jenkins integration for CI/CD
* Reusable request and response specifications

## Project Structure

```
src
 ├── main
 │   └── java
 │       └── payload / utilities
 └── test
     └── java
         ├── stepDefinitions
         ├── runners
         └── resources
             └── features
```

## Prerequisites

* Java 21 (Amazon Corretto)
* Maven
* IDE (Eclipse / IntelliJ)

## How to Run Tests

Clone the repository:

```
git clone <repository-url>
```

Navigate to project folder:

```
cd project-name
```

Run tests using Maven:

```
mvn test
```

Run tests with specific tag:

```
mvn test -Dcucumber.options="--tags @tagname"
```

## Reporting

After execution, reports are generated in:

```
target/
```

## CI/CD Integration

This framework can be integrated with **Jenkins** to automatically trigger API test execution during the CI/CD pipeline.

## Author

API Automation Framework created for learning and practical implementation of REST API testing using BDD.
