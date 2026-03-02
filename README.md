#PROJECT OWERVIEW:
 project  name: Selenium TestNG Automation Framework
  language: Java
  framework: Selenium WebDriver + TestNG

description: >
  A UI automation framework built using Selenium WebDriver and TestNG.
  This project implements reusable test structure, modular design,
  and automates web application tasks using TestNG test suites.

features:
  - Uses Selenium WebDriver for browser automation
  - TestNG for test execution and reporting
  - Modular test structure
  - Easy to add new tests and pages

tech_stack:
  - Java
  - Selenium WebDriver
  - TestNG
  - Maven

project_structure:
  - src/main/java : Contains framework utilities and page classes
  - src/test/java : Contains TestNG test classes
  - pom.xml : Maven build and dependencies
  - testng.xml : TestNG suite configuration

how_to_run:
  steps:
    - Clone the repository
    - Open in IDE (IntelliJ / Eclipse / VS Code)
    - Run tests using TestNG XML
    - Or run tests with Maven:
      `mvn test`

expected_skills:
  - Understanding of Selenium basics
  - TestNG annotations (@Test, @BeforeMethod, @AfterMethod)
  - Page Object Model (POM) pattern

learning_outcomes:
  - Build reusable automation tests
  - Organize framework structure
  - Execute tests across browsers
  - Debug and report test results

future_enhancements:
  - Add configuration file support
  - Add reports (Extent, Allure)
  - Add data driven tests
    
