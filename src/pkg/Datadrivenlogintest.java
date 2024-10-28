package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilitiespackage.Excelutil;

public class Datadrivenlogintest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com");

        ExcelUtil.loadExcel("path_to_excel_file.xlsx");
        ExcelUtil.setSheet("LoginData");
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        int rowCount = ExcelUtil.getRowCount();
        Object[][] data = new Object[rowCount - 1][2];

        for (int i = 1; i < rowCount; i++) {
            data[i - 1][0] = ExcelUtil.getCellData(i, 0);  // Email
            data[i - 1][1] = ExcelUtil.getCellData(i, 1);  // Password
        }
        return data;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
