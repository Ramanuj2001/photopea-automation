package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PhotopeaPage {

    WebDriver driver;
    Actions act;

    public PhotopeaPage(WebDriver driver) {

        this.driver = driver;
        act = new Actions(driver);

    }

    public void createCanvas() throws Exception {

        driver.findElement(By.xpath("//div[text()='File']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='New']")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("width")).clear();
        driver.findElement(By.name("width")).sendKeys("1280");

        driver.findElement(By.name("height")).clear();
        driver.findElement(By.name("height")).sendKeys("960");

        driver.findElement(By.xpath("//button[text()='Create']")).click();

    }

}
