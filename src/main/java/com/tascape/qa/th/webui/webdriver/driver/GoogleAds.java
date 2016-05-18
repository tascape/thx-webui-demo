/*
 * Copyright 2015 - 2016 Nebula Bay.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tascape.qa.th.webui.webdriver.driver;

import com.tascape.qa.th.webui.driver.WebPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sample page.
 * http://www.seleniumeasy.com/selenium-tutorials/xpath-tutorial-for-selenium.
 * http://www.seleniumeasy.com/selenium-tutorials/examples-for-xpath-and-css-selectors.
 *
 * @author linsong wang
 */
public class GoogleAds extends WebPage {

    @FindBy(xpath = "//h1[contains(text(), 'AdWords')]/following::a")
    private WebElement adWords;

    @FindBy(xpath = "//h1[contains(text(), 'AdSense')]/following::a")
    private WebElement adSense;

    @Override
    public String getPath() {
        return "/intl/en/ads/";
    }

    public void openAdWords() {
        adWords.click();
    }

    public void openAdSense() {
        adSense.click();
    }

    @Override
    protected void isLoaded() throws Error {
        String title = this.webBrowser.getTitle();
        Assert.assertEquals("Not on the expected page: " + title, "Google Ads", title);
    }
}
