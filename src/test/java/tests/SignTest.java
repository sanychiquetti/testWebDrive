package tests;

import static org.junit.Assert.*; //se meus métodos serão estáticos, posso declarar aqui, e não usar no metodo a palavra assert
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marel-Not\\Downloads\\PROGRAMAS_SOFTWARE\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver(); //instanciando o chrome aqui abrimos o chrome
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://juliodelima.com.br/taskit"); //entrando no site
        navegador.findElement(By.linkText("Sign in")).click(); // aqui vamos clicar no link procurano pelo texto do link
        navegador.findElement(By.xpath("//*[@id=\"login-sign-in\"]")).sendKeys("sanygarcia"); // procurando o campo pelo nome dele e escrevendo nele
        navegador.findElement(By.xpath("//*[@id=\"password-sign-in\"]")).sendKeys("@123456"); //procurando o campo pelo nome e escrevendo a senha nele
        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText(); //criando uma variável buscando o texto dentro da classe

        assertEquals("Hi, Julio", saudacao); // validando o texto da variável.
        navegador.quit();
    }

}
