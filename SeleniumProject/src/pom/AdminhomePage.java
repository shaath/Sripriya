package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminhomePage {

	@FindBy(linkText="Admin")
	WebElement admin;
	
	@FindBy(linkText="PIM")
	WebElement pim;
	
	@FindBy(linkText="Leave")
	WebElement leave;
	
	@FindBy(linkText="Time")
	WebElement time;
	
	@FindBy(linkText="Recruitment")
	WebElement recruitment;
	
	@FindBy(linkText="My Info")
	WebElement myInfo;
	
	@FindBy(linkText="Performance")
	WebElement performance;
	
	@FindBy(linkText="Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText="Directory")
	WebElement directory;
	
	@FindBy(linkText="Maintenance")
	WebElement maintenance;
	
	@FindBy(linkText="Buzz")
	WebElement buzz;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome;
	
	@FindBy(linkText="About")
	WebElement about;
	
	@FindBy(linkText="Support")
	WebElement support;
	
	@FindBy(linkText="Change Password")
	WebElement cp;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void AdminClick(){
		admin.click();
	}
	
	public void PimClick(){
		pim.click();
	}
	
	public void LeaveClick(){
		leave.click();
	}
	
	public void TimeClick(){
		time.click();
	}
	
	public void RecruitmentClick(){
		recruitment.click();
	}
	
	public void MyInfoClick(){
		myInfo.click();
	}
	
	public void PerformanceClick(){
		performance.click();
	}
	
	public void DashboardClick(){
		dashboard.click();
	}
	
	public void DirectoryClick(){
		directory.click();
	}
	
	public void MaintenanceClick(){
		maintenance.click();
	}
	
	public void BuzzClick(){
		buzz.click();
	}
	
	public void WelcomeClick(){
		welcome.click();
	}
	
	public void AboutClick(){
		about.click();
	}
	
	public void SupportClick(){
		support.click();
	}
	
	public void ChangePasswordClick(){
		cp.click();
	}
	
	public void LogoutClick(){
		logout.click();
	}
}
