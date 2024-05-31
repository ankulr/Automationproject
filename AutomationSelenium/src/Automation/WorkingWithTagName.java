package Automation;

c
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTextField =driver.findElement(By.tagName("input"));
		searchTextField.sendKeys("book");
		//clicking on searchbutton
		WebElement searchButton =driver.findElement(By.className("search-box-button"));
		searchButton.click();
}
}
