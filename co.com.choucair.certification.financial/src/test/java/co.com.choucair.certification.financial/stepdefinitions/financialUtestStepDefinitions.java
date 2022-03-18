package co.com.choucair.certification.financial.stepdefinitions;

import co.com.choucair.certification.financial.questions.Answer;
import co.com.choucair.certification.financial.tasks.Completes;
import co.com.choucair.certification.financial.tasks.JoinToday;
import co.com.choucair.certification.financial.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class financialUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast()); }


   @Given("^tania wants to create a user on the Utest page$")
   public void taniaWantsToCreateAUserOnTheUtestPage() {
        OnStage.theActorCalled("Tania").attemptsTo(OpenUp.thePage(), (JoinToday.onThePage()));
}


    @When("^she looks for (.*) and completes the data$")
    public void sheLooksForTheJoinTodayButtonAndCompletesTheData(String data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Completes.the(data));
}


    @Then("^she accesses the page and displays the message (.*)$")
    public void sheAccessesThePageAndDisplaysTheMessageWelcome(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
}


}