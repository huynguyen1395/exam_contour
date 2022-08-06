package com.demo.exam.steps.serenity;
import com.demo.exam.pages.ProfileManagerPage;
import net.thucydides.core.annotations.Step;

//define steps on create mail page
public class CreateMemberSteps {
	
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
    public void input_information() {
    	profileManagerPage.input_information();
    }
    
    @Step
    public void click_check_box_agree_terms_and_conditions(){
    	profileManagerPage.click_check_box_agree_terms_and_conditions();
    }
    
    @Step
    public void click_button_submit(){
    	profileManagerPage.click_button_submit();
    } 
    
    @Step
    public void check_add_member_success(){
    	profileManagerPage.check_add_member_success();
    } 
}