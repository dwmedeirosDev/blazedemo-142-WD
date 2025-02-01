// 1- Bibliotecas, imports...

// Biblioteca do JUnit
import org.junit.jupiter.api.AfterEach; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

import org.openqa.selenium.By; // Biblioteca do Selenium para localizar elementos na página
import org.openqa.selenium.WebDriver; // Biblioteca principal do Selenium
// import org.openqa.selenium.WebElement; // Biblioteca do Selenium para elementos da página
import org.openqa.selenium.chrome.ChromeDriver; // Biblioteca do ChromeDriver

// 2- Classe 
public class PassagemTest {

    // 2.1- Atributos
    private WebDriver driver; // Objeto do Selenium
    

    // 2.2- Métodos e funções

    // Antes do teste
    @BeforeEach
    public void iniciar() {
        driver = new ChromeDriver(); // Instanciar o objeto do Selenium como ChromeDriver & "Ligar o navegador"
        driver.manage().window().maximize(); // Maximizar a janela do browser
    }

    // Depois do teste
    @AfterEach
    public void finalizar() {
        driver.quit(); // "Desligar o navegador"
    }

    // Teste
    @Test
    public void comprarPassagem() {
        driver.get("https://www.blazedemo.com"); // Acessar o site Blazedemo

        // // Jeito que o professor ensinou em aula &&
        // // Selecionar o dropdown (Menu suspenso) de origem e destino e clicar no botão Find Flights
        // driver.findElement(By.name("fromPort")).click(); // Clicar no campo de origem
        // {
        //     WebElement dropdown = driver.findElement(By.name("fromPort")); // Selecionar o campo de origem
        //     dropdown.findElement(By.xpath("//option[. = \"São Paolo\"]")).click(); // Selecionar a opção São Paolo e clicar
        // }
        
        // driver.findElement(By.name("toPort")).click(); // Clicar no campo de destino
        // {
        //     WebElement dropdown = driver.findElement(By.name("toPort")); // Selecionar o campo de destino
        //     dropdown.findElement(By.xpath("//option[. = \"New York\"]")).click(); // Selecionar a opção New York e clicar
        // }

        // ==============================================================================================================================

        // // Jeito alternativo de selecionar o destino &&
        // // Selecionar o dropdown (Menu suspenso) de origem e destino e clicar no botão Find Flights
        // {
        //     WebElement dropdown = driver.findElement(By.name("fromPort")); // Selecionar o campo de origem
        //     dropdown.click(); // Clicar no campo de origem
        //     dropdown.findElement(By.xpath("//option[. = \"São Paolo\"]")).click(); // Selecionar a opção New York e clicar
        // }
        
        // {
        //     WebElement dropdown = driver.findElement(By.name("toPort")); // Selecionar o campo de destino
        //     dropdown.click(); // Clicar no campo de destino
        //     dropdown.findElement(By.xpath("//option[. = \"New York\"]")).click(); // Selecionar a opção New York e clicar
        // }

        // ==============================================================================================================================

        // Jeito simplificado &&
        // Selecionar o dropdown (Menu suspenso) de origem e destino e clicar no botão Find Flights
        {
            driver.findElement(By.name("fromPort")).click();
            driver.findElement(By.xpath("//option[. = \"São Paolo\"]")).click();
        }

        {
            driver.findElement(By.name("toPort")).click();
            driver.findElement(By.xpath("//option[. = \"New York\"]")).click();
        }

        {
            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        }    
    }
}