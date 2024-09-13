package maven17.Expection;
import org.openqa.selenium.WebDriver;

public class ExceptionHandlingDemo {

    private static final Object Nibir = null;

    // Method that throws an exception
    public static void openBrowser() throws Exception {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver();
        WebDriver driver = null;
        try {
            // Attempting to launch the browser
            driver = new ChromeDriver();
            driver.get("https://www.example.com");

            // Simulate an error by throwing an exception
            if (driver.getTitle().equals(Nibir)) {
                throw new NullPointerException("Title not found");
            }

            System.out.println("Page title is: Boss " + driver.getTitle());

        } catch (NullPointerException e) {
            // Catching NullPointerException
            System.out.println("Caught exception: " + e.getMessage());
            throw e;  // Re-throw the exception for demonstration

        } catch (Exception e) {
            // Catching any other exceptions
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            // Clean-up code in the finally block
            if (driver != null) {
                driver.wait();  // Properly close the browser
                System.out.println("Browser closed.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Call method that throws exception
            openBrowser();
        } catch (Exception e) {
            // Handle the thrown exception in main
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}


