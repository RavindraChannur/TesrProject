package common;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import StepDefination.LoginStepDefination;

public class Screenshot {
	WebDriver driver;
	
	
	public void takescreen() throws IOException {
	
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\Channur\\test.png"));
		}
}
