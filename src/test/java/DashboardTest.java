import Pages.DashboardPage;
import org.testng.annotations.Test;

public class DashboardTest extends TestBaseClassFront{
    DashboardPage dashboardPage;
    @Test
    public void getAllFittingBets(){
        dashboardPage = new DashboardPage(driver.get());
        dashboardPage.goTo();
        dashboardPage.pressUpcomingTab();
        dashboardPage.printAllFittingEvents();
    }

}
