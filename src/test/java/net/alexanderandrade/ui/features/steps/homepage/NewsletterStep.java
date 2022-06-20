package net.alexanderandrade.ui.features.steps.homepage;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.alexanderandrade.ui.screenplay.questions.homepage.NewsletterQuestions;
import net.alexanderandrade.ui.screenplay.tasks.homepage.NewsletterTasks;
import org.jetbrains.annotations.NotNull;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class NewsletterStep {

  @Cuando("inscribe su correo {string} a la newsletter")
	public void ellaBuscaAlgoComo ( @NotNull String emailAddress ) {
    theActorInTheSpotlight().attemptsTo( NewsletterTasks.suscribeEmailToNewsletter( emailAddress ) );
  }

	@Entonces("puede ver la confirmación que dice {string}")
	public void ellaPuedeVerQueLaPrimeraRespuestaEs ( String message ) {
		theActorInTheSpotlight().should(
			seeThat( NewsletterQuestions.getLabelText(), equalTo( message ) )
		);
	}
}
