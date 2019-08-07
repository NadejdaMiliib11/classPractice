package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {
    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".search-input.clearable")
    public WebElement searchBox;

    @FindBy(xpath= "//button[@value='Search']")
    public WebElement searchBoxButton;






}
