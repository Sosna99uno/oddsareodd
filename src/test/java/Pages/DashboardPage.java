package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardPage {
    private WebDriver driver;

    @FindBy(id = "user-menu-login")
    private WebElement loginButton;

    @FindBy(id = "menusportbookprematch")
    private WebElement upcomingTab;

    @FindBy(css = "tr.event-row")
    private List<WebElement> eventRowsAll;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void printAllFittingEvents(){
        System.out.println(eventRowsAll.size());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        Map<Integer,List<Double>> eventOdds = new HashMap();
        int i = 0;

            for (WebElement singleRow : eventRowsAll) {
                List<Double> oddsPerEvent = new ArrayList<>();
                List<WebElement> oddElements = singleRow.findElements(By.cssSelector("span.odd-content.notranslate"));
                for (WebElement singleElementOdds : oddElements) {
                    oddsPerEvent.add(Double.parseDouble(singleElementOdds.getText()));
                }

                boolean fittingOdds = oddsPerEvent.stream().allMatch(odd -> odd >= 1.5 && odd <= 3.34);
                if (fittingOdds){
                    eventOdds.put(i, oddsPerEvent);
                }
                i++;
            }
        System.out.println(eventOdds);
    }

    public void pressUpcomingTab(){
        this.upcomingTab.click();
    }

    public void goTo(){
        this.driver.get("https://s.gsb.co.zm/sportsbook/upcoming");
    }
}