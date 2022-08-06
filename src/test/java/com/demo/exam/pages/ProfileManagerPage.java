package com.demo.exam.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import com.demo.exam.common.DataTest;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import static com.demo.exam.common.Configs.BASE_URL;

//this is profile manager page
@DefaultUrl(BASE_URL)
public class ProfileManagerPage extends PageObject {

	@FindBy(xpath = "//a[@href='/']")
	private WebElementFacade homeTab;

	@FindBy(xpath = "//a[@href='/add-member']")
	private WebElementFacade addMemberTab;

	@FindBy(xpath = "//a[@href='/search-member']")
	private WebElementFacade searchMemberTab;

	@FindBy(xpath = "//a[@href='/view-member']")
	private WebElementFacade viewMemberTab;

	@FindBy(xpath = "//*[@id='first_name']")
	private WebElementFacade firstNameText;

	@FindBy(xpath = "//*[@id='last_name']")
	private WebElementFacade lastNameText;

	@FindBy(xpath = "//*[@id='title']")
	private WebElementFacade titleText;

	@FindBy(xpath = "//*[@id='company']")
	private WebElementFacade companyText;

	@FindBy(xpath = "//*[@id='phone']")
	private WebElementFacade phoneText;

	@FindBy(xpath = "//*[@id='website']")
	private WebElementFacade websiteText;

	@FindBy(xpath = "//*[@id='email']")
	private WebElementFacade emailText;

	@FindBy(xpath = "//input[@id='remember']")
	private WebElementFacade agreeCheckBox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElementFacade submitButton;

	@FindBy(xpath = "//div[@id='toast-success']//div[2]")
	private WebElementFacade toastSuccessText;

	@FindBy(xpath = "//input[@id='default-search']")
	private WebElementFacade searchText;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[5]")
	private WebElementFacade resultEmailSearch;
	
	DataTest data = new DataTest();
	String[] information = data.generate_profile_information();
	
	public void navigate_to_tab(String tab) {
		switch (tab) {
		case "Home":
			homeTab.click();
			break;
		case "Add Member":
			addMemberTab.click();
			break;
		case "Search Member":
			searchMemberTab.click();
			break;
		case "View Member":
			viewMemberTab.click();
			break;
		}
	}

	public void input_information() {
		WebElementFacade[] listElementInfo = { firstNameText, lastNameText, titleText, companyText, phoneText, websiteText,
				emailText };
		for (int i = 0; i < 7; i++) {
			listElementInfo[i].type(information[i]);
			DataTest.expectInfo.add(information[i]);
		}
	}

	public void click_check_box_agree_terms_and_conditions() {
		agreeCheckBox.click();
	}

	public void click_button_submit() {
		submitButton.click();
		String text = toastSuccessText.getText();
		String[] listText = text.split(": ");
		DataTest.memberId = listText[1];
	}

	public List<String> get_info_member_by_id(String memberId) {
		navigate_to_tab("View Member");
		searchText.type(memberId);
		submitButton.click();
		List<String> info = new ArrayList<String>();
		WebElementFacade[] listElementInfo = { firstNameText, lastNameText, titleText, companyText, phoneText, websiteText,
				emailText };
		for (WebElementFacade e : listElementInfo) {
			info.add(e.getText());
		}
		return info;
	}

	public void check_add_member_success() {
		List<String> actual_info = get_info_member_by_id(DataTest.memberId);
		for (int i=0; i < actual_info.size(); i++) {
			assertEquals("info should equal", DataTest.expectInfo.get(i), actual_info.get(i));
		}
	}
	
	public void input_text_search() {
		searchText.type(DataTest.expectInfo.get(6));
	}
	
	public void click_button_search() {
		submitButton.click();
	}
	
	public void check_search_member_success() {
		String actualSearchEmail = resultEmailSearch.getText();
		assertEquals("email should equal", DataTest.expectInfo.get(6), actualSearchEmail);
	}
}