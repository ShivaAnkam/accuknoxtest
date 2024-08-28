# IntegrationTest

## Overview

The `IntegrationTest` class is an automated test script written in Java using TestNG and Selenium WebDriver. This test verifies that the frontend of a web application displays the correct data received from the backend.

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure that you have JDK 8 or later installed on your machine.
2. **Maven**: This project uses Maven for dependency management. Install Maven if you haven't already.
3. **Selenium WebDriver**: This project uses Selenium WebDriver to interact with the browser.
4. **WebDriverManager**: This is used to automatically manage the WebDriver binaries.

## Setup

1. **Clone the Repository**: Clone this repository to your local machine.

    ```bash
    git clone https://github.com/yourusername/yourrepository.git
    cd yourrepository
    ```

2. **Install Dependencies**: Ensure that Maven dependencies are installed. Run the following command to download the required dependencies:

    ```bash
    mvn clean install
    ```

## Configuration

1. **WebDriver**: This test uses ChromeDriver. WebDriverManager is configured to automatically download and manage the ChromeDriver binary.

2. **URL**: The `driver.get("http://localhost:8080/");` line in the `openBrowser` method specifies the URL of the web application to be tested. Ensure that your web application is running on `localhost:8080` before running the test.

## Running the Test

1. **Run with Maven**: You can execute the test using Maven's `test` goal. Navigate to the project directory and run:

    ```bash
    mvn test
    ```

2. **IDE Execution**: If you are using an IDE like IntelliJ IDEA or Eclipse, you can run the `IntegrationTest` class directly from the IDE. Right-click on the `IntegrationTest` class and select `Run`.

## Test Details

- **Test Class**: `IntegrationTest`
- **Test Framework**: TestNG
- **Browser**: Chrome (managed by WebDriverManager)
- **Test Method**: 
  - `testFrontendDisplaysBackendData`: Verifies that the frontend displays the expected text from the backend.

## Notes

- The test waits for 5 seconds after opening the browser to allow the page to fully load. Adjust this delay if necessary based on the performance of your web application.
- Ensure the web application under test is correctly set up and running before executing the test.

## Troubleshooting

- **Browser Not Launching**: Ensure ChromeDriver is compatible with your installed version of Google Chrome. WebDriverManager should handle this automatically, but check for any version mismatches.
- **Test Fails**: Verify that the web application is serving the expected content at the specified URL. Also, check the XPath used to locate the text and adjust if necessary.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or issues, please contact [your email address] or open an issue in the repository.

---

Happy testing!
