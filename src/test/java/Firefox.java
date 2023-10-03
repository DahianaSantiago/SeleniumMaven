import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firefox {
    public static void main(String[] args) {


        // Configura la ubicación del controlador de Chrome WebDriver
        System.setProperty("web-driver.chrome.driver","chrome.exe");

        // Instancia del controlador de Selenium (en este caso, Chrome)
        WebDriver driver = new ChromeDriver();

        // Navegar a la página de Google
        driver.get("https://www.google.com");

        // Encontrar el campo de búsqueda por su nombre "q"
        driver.findElement(By.name("q")).sendKeys("Pruebas automatizadas con Selenium" + Keys.RETURN);

        // Esperar unos segundos para que los resultados se carguen (puedes ajustar el tiempo)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cerrar el navegador
        driver.quit();
    }
}