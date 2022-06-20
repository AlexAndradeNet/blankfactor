/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.questions.homepage;

import net.alexanderandrade.ui.screenplay.ui.homepage.HomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeQuestions {

  private HomeQuestions () {
    throw new IllegalStateException("Utility class");
  }

  @Subject("obtener el texto del encabezado de la página")
  public static Question<String> getPostList () {
    List<WebElementFacade> postList = HomePage.LIST_POST_LINKS.resolveAllFor( theActorInTheSpotlight() );
    StringBuilder result = new StringBuilder();
    for (WebElementFacade element : postList) {
      result.append( element.getText() ).append( " ----------------------> " ).append( element.getAttribute( "href" ) ).append( "\n" );
    }

    Serenity.recordReportData().withTitle( "Lista de artículos" ).andContents( result.toString() );

    return actor -> Text.of( HomePage.LIST_POST_LINKS ).viewedBy(theActorInTheSpotlight()).asString();
  }
}
