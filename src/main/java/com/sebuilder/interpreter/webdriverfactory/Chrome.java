package com.sebuilder.interpreter.webdriverfactory;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome implements WebDriverFactory {
    /**
     * @param config Key/value pairs treated as required capabilities, with the exception of:
     *               <ul>
     *               <li>binary: path to Firefox binary to use</li>
     *               <li>profile: path to Firefox profile to use</li>
     *               </ul>
     * @return A FirefoxDriver.
     */
    @Override
    public RemoteWebDriver make(HashMap<String, String> config) {
//        FirefoxBinary fb = config.containsKey("binary")
//                ? new FirefoxBinary(new File(config.get("binary")))
//                : new FirefoxBinary();
//
//        HashMap<String, String> caps = new HashMap<String, String>(config);
//        caps.remove("binary");
//        caps.remove("profile");

        return new ChromeDriver(DesiredCapabilities.chrome());
//        return new ChromeDriver(new DesiredCapabilities(caps));
    }
}