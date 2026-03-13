package tests;

import base.BaseTest;
import pages.PhotopeaPage;

public class PhotopeaTest extends BaseTest {

    public static void main(String[] args) throws Exception {

        BaseTest test = new BaseTest();

        test.setup();

        PhotopeaPage page = new PhotopeaPage(driver);

        page.createCanvas();

        Thread.sleep(5000);

        driver.quit();

    }

}