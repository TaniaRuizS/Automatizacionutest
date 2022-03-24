package co.com.choucair.certification.financial.stepdefinitions;

import co.com.choucair.certification.financial.model.InformationData;
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

import java.util.List;

public class financialUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast()); }


   @Given("^tania wants to create a user on the Utest page$")
   public void taniaWantsToCreateAUserOnTheUtestPage() {
        OnStage.theActorCalled("Tania").attemptsTo(OpenUp.thePage(), (JoinToday.onThePage()));
}


    @When("^she looks for the JoinToday button and completes the data$")
    public void sheLooksForTheJoinTodayButtonAndCompletesTheData(List<InformationData> informationData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Completes.the(informationData.get(0)));
}


    @Then("^she accesses the page and displays the message (.*)$")
    public void sheAccessesThePageAndDisplaysTheMessageWelcome(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
}


}