package net.alexanderandrade.ui.features.steps.homepage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

import net.alexanderandrade.ui.screenplay.questions.AuthorQuestions;
import net.alexanderandrade.ui.screenplay.questions.homepage.HomeQuestions;
import net.alexanderandrade.ui.screenplay.tasks.homepage.HomeTasks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;

public class HomeStep {

  @Cuando("ella busca los post de {string}")
	public void ellaBuscaAlgoComo ( @NotNull String searchString ) {
    theActorInTheSpotlight().attemptsTo( HomeTasks.lookupForAuthorName( searchString ) );
  }

	@Entonces("ella puede ver la página de autor de {string}")
	public void ellaPuedeVerQueLaPrimeraRespuestaEs ( String author ) {
		final String EXPECTED_URL = "https://blankfactor.com/author/" + author.replace( " ", "-" ).toLowerCase() + "/";
		final String EXPECTED_TITLE = "Author page: " + author;

		theActorInTheSpotlight().attemptsTo( Ensure.thatTheCurrentPage().currentUrl().isEqualTo( EXPECTED_URL ) );

		theActorInTheSpotlight().should(
			seeThat( AuthorQuestions.getPagePrincipalHeader(), equalTo( EXPECTED_TITLE ) )
		);
	}

	@Cuando("solicita una lista de los post promocionados")
	public void solicitaListaDePosts () {
		theActorInTheSpotlight().attemptsTo( HomeTasks.waitForPostList() );
	}

	@Entonces("obtiene una lista que relaciona los posts y sus enlaces")
	public void obtineUnaListaDePosts () {
		theActorInTheSpotlight().should(
			seeThat( HomeQuestions.getPostList(), notNullValue() )
		);
	}
}
