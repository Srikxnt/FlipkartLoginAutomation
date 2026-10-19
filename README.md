\# **Flipkart Login Automation Testing**



\## **Project Overview**



This project automates the UI testing of the Flipkart login page using Selenium WebDriver with Java, TestNG, and Maven.



The objective is to practice browser automation, web element identification, explicit waits, assertions, and automated test execution as part of my QA Automation learning journey.



\## **Technologies Used**



\- \*\*Programming Language:\*\* Java

\- \*\*Automation Tool:\*\* Selenium WebDriver

\- \*\*Testing Framework:\*\* TestNG

\- \*\*Build Tool:\*\* Maven

\- \*\*IDE:\*\* Eclipse

\- \*\*Browser:\*\* Google Chrome

\- \*\*Version Control:\*\* Git and GitHub



\## Project Structure



```text

FlipkartAutomation/

├── src/

│   └── test/

│       └── java/

│           └── com/

│               └── flipkart/

│                   └── Logintest.java

├── pom.xml

├── .gitignore

└── README.md

```



**## Test Scenarios**



The current automation test covers:



1\. Opening the Flipkart login page.

2\. Waiting for the login page to load.

3\. Locating the phone number input field.

4\. Entering a phone number.

5\. Retrieving and validating the entered value.

6\. Verifying that the phone number contains exactly 10 digits.

7\. Checking whether the Continue button is enabled.

8\. Clicking Continue when it is enabled.



\*\*Note:\*\* The current test validates the entered value and button state. It does not verify successful authentication or OTP login.



**## Prerequisites**



Before running the project, ensure you have:



\- Java Development Kit (JDK) installed.

\- Eclipse IDE or another Java IDE.

\- Maven configured for the project.

\- Google Chrome installed.

\- Git installed (optional for running tests).



\## How to Run the Project



\### 1. Clone the repository



```bash

git clone https://github.com/YOUR-USERNAME/flipkart-selenium-automation.git

```



Replace `YOUR-USERNAME` with your GitHub username.



&#x20;**2. Open the project in Eclipse**



Import the project as an existing Maven project.



&#x20;**3. Download Maven dependencies**



Right-click the project and select:



\*\*Maven → Update Project\*\*



&#x20;**4. Run the test**



Open `Logintest.java`, right-click the file, and select:



\*\*Run As → TestNG Test\*\*



Alternatively, if your Maven project is configured with the appropriate TestNG provider, you can run:



```bash

mvn test

```



&#x20;S**kills Practiced**



\- Selenium WebDriver fundamentals

\- Locating web elements using XPath

\- Handling input fields and buttons

\- Explicit waits with `WebDriverWait`

\- Synchronization using `ExpectedConditions`

\- Assertions using TestNG

\- Maven project setup and dependency management

\- Git version control and GitHub repository management



&#x20;**Future Enhancements**



\- Add positive and negative input validation tests.

\- Add data-driven testing with multiple test inputs.

\- Improve locator stability and maintainability.

\- Introduce the Page Object Model (POM).

\- Generate TestNG test reports.

\- Integrate automated test execution with GitHub Actions.



&#x20;**Disclaimer**



This project is intended for educational and portfolio purposes. It does not bypass authentication, and it does not attempt to access accounts without authorization.



\---



\*\*Author:Srikant Sangolagi



\*\*GitHub:https://github.com/Srikxnt

