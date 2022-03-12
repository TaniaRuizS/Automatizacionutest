package co.com.choucair.certification.financial.stepdefinitions;

import co.com.choucair.certification.financial.questions.Answer;
import co.com.choucair.certification.financial.tasks.CreateUser;
import co.com.choucair.certification.financial.tasks.JoinToday;
import co.com.choucair.certification.financial.tasks.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class financialUtestStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}


    @Given("^I want to create a user and load the main page uTest$")
    public void iWantToCreateAUserAndLoadTheMainPageUTest() {
        OnStage.theActorCalled("UsuarioTania").wasAbleTo(OpenUp.thePage(), (JoinToday.onThePage()));
        //UsuarioTania se dirige a la pagina Utest
    }


    @When("^I look for the Join Today (.*) button$")
    public void iLookForTheJoinTodayButton(String jointoday) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.the(jointoday));
    }

    @Then("^I find the page to fill out the user creation form$")
    public void iFindThePageToFillOutTheUserCreationForm(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}