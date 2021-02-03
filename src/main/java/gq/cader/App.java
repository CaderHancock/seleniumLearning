package gq.cader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    }

    public String poopFace() {

        FirefoxDriver yolo = new FirefoxDriver();
        yolo.get("https://systemcrafters.cc/articles/");
        WebElement stuff = yolo.findElementByClassName("blog-footer");
        return stuff.getText();

    }

    public Boolean thisIsWhack() {

        ChromeDriver evil = new ChromeDriver();
        evil.get("https://systemcrafters.cc/articles/");
        WebElement poop = evil.findElement(By.className("blog-post"));
        System.out.println("my dick is " + poop.getSize().getHeight() + " inches");
        return false;
    }

}
