package gq.cader;

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
        yolo.get("https://www.reddit.com");
        return yolo.getTitle();
    }

}
