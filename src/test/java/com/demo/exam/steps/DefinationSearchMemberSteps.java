package com.demo.exam.steps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import com.demo.exam.steps.serenity.SearchMemberSteps;

//Define steps 
public class DefinationSearchMemberSteps {

	@Steps
	SearchMemberSteps searchMemberSteps;

	@BeforeScenario
	public void user_access_to_profile_manager_page() {
		searchMemberSteps.is_the_profile_manager_page();
	}
	
	@Given("the user navigate to tab '$tab'")
	public void user_navigate_to_search_member_tab(String tab) {
		searchMemberSteps.navigate_to_tab(tab);
	}
	
	@When("the user input searching text")
	public void user_input_searching_text() {
		searchMemberSteps.input_text_search();
	}

	@When("the user click button search")
	public void user_click_search_button() {
		searchMemberSteps.click_button_search();
	}
	
	@Then("the user check result")
	public void check_search_member_success() {
		searchMemberSteps.check_search_member_success();
	}
}
