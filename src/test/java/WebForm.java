import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    @FindBy(xpath = "/html/body")
    private WebElement pageText;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public String getTextFromSite(){
        return this.pageText.getText();
    }
}
