package com.scobi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page {
	// sign in
	@FindBy(id = "userName")
	private WebElement UserTb;
	@FindBy(id = "passWord")
	private WebElement passTb;
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement checkbx;
	@FindBy(xpath = "//input[@type=\"image\"]")
	private WebElement loginBtn;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgotlnk;
	// rigistration
	@FindBy(xpath = "//img[@title='New User Registration']")
	private WebElement RigstrBtn;
	@FindBy(id = "username")
	private WebElement RUserTb;
	@FindBy(id = "password")
	private WebElement RpassTb;
	@FindBy(name = "secureWord")
	private WebElement RwordTb;
	@FindBy(id = "agreement")
	private WebElement RcheckTb;
	@FindBy(xpath = "//img[@title=\"Register Now\"]")
	private WebElement RRbutn;

	// lead
	@FindBy(xpath = "//a[text()=\'New Lead\']")
	private WebElement Leadlnk;
	@FindBy(xpath = "//option[text()='Mr.']")
	private WebElement surname;
	@FindBy(name = "property(First Name)")
	private WebElement frstname;
	@FindBy(name = "property(Company)")
	private WebElement compnyname;
	@FindBy(name = "property(Last Name)")
	private WebElement lastname;
	@FindBy(name = "Button")
	private WebElement savebtn;

	public Sign_in_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getLeadlnk() {
		return Leadlnk;
	}

	public void setLeadlnk(WebElement leadlnk) {
		Leadlnk = leadlnk;
	}
	
	public void clickNewLeadButton()
	{
		Leadlnk.click();
	}

	public WebElement getSurname() {
		return surname;
	}

	public void setSurname(WebElement surname) {
		this.surname = surname;
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public void setFrstname(WebElement frstname) {
		this.frstname = frstname;
	}

	public WebElement getCompnyname() {
		return compnyname;
	}

	public void setCompnyname(WebElement compnyname) {
		this.compnyname = compnyname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getRRbutn() {
		return RRbutn;
	}

	public void setRRbutn(WebElement rRbutn) {
		RRbutn = rRbutn;
	}

	public WebElement getUserTb() {
		return UserTb;
	}

	public void setUserTb(WebElement userTb) {
		UserTb = userTb;
	}

	public WebElement getPassTb() {
		return passTb;
	}

	public void setPassTb(WebElement passTb) {
		this.passTb = passTb;
	}

	public WebElement getCheckbx() {
		return checkbx;
	}

	public void setCheckbx(WebElement checkbx) {
		this.checkbx = checkbx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getForgotlnk() {
		return forgotlnk;
	}

	public void setForgotlnk(WebElement forgotlnk) {
		this.forgotlnk = forgotlnk;
	}

	public WebElement getRigstrBtn() {
		return RigstrBtn;
	}

	public void setRigstrBtn(WebElement rigstrBtn) {
		RigstrBtn = rigstrBtn;
	}

	public WebElement getRUserTb() {
		return RUserTb;
	}

	public void setRUserTb(WebElement rUserTb) {
		RUserTb = rUserTb;
	}

	public WebElement getRpassTb() {
		return RpassTb;
	}

	public void setRpassTb(WebElement rpassTb) {
		RpassTb = rpassTb;
	}

	public WebElement getRwordTb() {
		return RwordTb;
	}

	public void setRwordTb(WebElement rwordTb) {
		RwordTb = rwordTb;
	}

	public WebElement getRcheckTb() {
		return RcheckTb;
	}

	public void setRcheckTb(WebElement rcheckTb) {
		RcheckTb = rcheckTb;
	}

	public void login(String un, String pw)
	{
		UserTb.sendKeys(un);
		passTb.sendKeys(pw);
		loginBtn.click();
	}
	
	

}
