package com.demo.exam.steps.serenity;
import com.demo.exam.pages.ProfileManagerPage;
import net.thucydides.core.annotations.Step;

//define steps on create mail page
public class SearchMemberSteps {
	
    ProfileManagerPage profileManagerPage;
    
    @Step
    public void is_the_profile_manager_page() {
    	profileManagerPage.open();
    }
    
    @Step
    public void navigate_to_tab(String tab) {
    	profileManagerPage.navigate_to_tab(tab);
    }
    
    @Step
    public void input_text_search() {
    	profileManagerPage.input_text_search();
    }
    
    @Step
    public void click_button_search(){
    	profileManagerPage.click_button_search();
    } 
    
    @Step
    public void check_search_member_success(){
    	profileManagerPage.check_search_member_success();
    } 
}