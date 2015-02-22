package com.sebuilder.interpreter.webdriverfactory;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome implements WebDriverFactory {
    /**
     * @param config Key/value pairs treated as required capabilities.
     * @return A ChromeDriver.
     */
    @Override
    public RemoteWebDriver make(HashMap<String, String> config) {
        return new ChromeDriver(DesiredCapabilities.chrome());
    }
}