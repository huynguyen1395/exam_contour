package com.demo.exam.steps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import com.demo.exam.steps.serenity.CreateMemberSteps;

//Define steps 
public class DefinationCreateMemberSteps {

	@Steps
	CreateMemberSteps createMemberSteps;

	@BeforeScenario
	public void user_access_to_profile_manager_page() {
		createMemberSteps.is_the_profile_manager_page();
	}
	
	@Given("the user navigate to tab '$tab'")
	public void user_navigate_to_add_member_tab(String tab) {
		createMemberSteps.navigate_to_tab(tab);
	}
	
	@When("the user input profile information")
	public void user_input_information() {
		createMemberSteps.input_information();
	}

	@When("the user agree with terms and conditions")
	public void user_click_agree_check_box_and_submit() {
		createMemberSteps.click_check_box_agree_terms_and_conditions();
	}
	
	@When("the user submit information")
	public void user_submit_information() {
		createMemberSteps.click_button_submit();
	}
	
	@Then("the user get user by id and check information")
	public void check_add_member_success() {
		createMemberSteps.check_add_member_success();
	}
}
