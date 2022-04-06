package com.Framework.Selenium.Trabajo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String [] args){

        ///Setear la propiedad de Google Chrome y pasar ubicacion del WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\moral\\Downloads\\chromedriver.exe");
        ///Inicializar El WebDriver
        WebDriver driver=new ChromeDriver();

        ///Abrir el sitio Web
        driver.get("https://www.consultoriaglobal.com.ar/cgweb/?page_id=370");

        ///Maximizar el webBrowser
        driver.manage().window().maximize();

        ///Declaracion de Variables a Utilizar
        String username="pablo";
        String email="aaa@null.com";
        String as="Empleo";
        String mensaje="hola compañia mi nombre es pablo morales y desearia unirme a su equipo de trabajo";
        String cod="hola";



        ///Localizador By Name
        WebElement Name= driver.findElement(By.name("your-name"));
        WebElement em=driver.findElement(By.name("your-email"));
        WebElement asunto=driver.findElement(By.name("your-subject"));
        WebElement msj=driver.findElement(By.name("your-message"));
        WebElement codigo=driver.findElement(By.name("captcha-636"));
        /// Localizador By Xpath
        WebElement enviar=driver.findElement(By.xpath("//*[@id=\"wpcf7-f1297-p370-o1\"]/form/p[7]/input"));



        ///Acceso Al Sitio Web
        Name.sendKeys(username);
        em.sendKeys(email);
        asunto.sendKeys(as);
        msj.sendKeys(mensaje);
        codigo.sendKeys(cod);
        enviar.click();














    }

}
