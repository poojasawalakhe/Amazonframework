package com.listner;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class MyListner implements ITestListener{

	public void onTestFailure(ITestResult result) {
		AShot shot = new AShot();
		shot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot sc =shot.takeScreenshot(TestBase.driver);
		
		BufferedImage img = sc.getImage();
		try {
			ImageIO.write(img, "jpg", new File("screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//add
		
	}

}
