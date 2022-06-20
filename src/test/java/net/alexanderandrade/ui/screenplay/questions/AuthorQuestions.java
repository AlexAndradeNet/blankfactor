/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.questions;

import net.alexanderandrade.ui.screenplay.ui.AuthorPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthorQuestions {

  private AuthorQuestions () {
    throw new IllegalStateException("Utility class");
  }

  @Subject("obtener el texto del encabezado de la página")
  public static Question<String> getPagePrincipalHeader () {
    return actor -> Text.of( AuthorPage.HEADER_PRINCIPAL ).viewedBy(theActorInTheSpotlight()).asString() ;
  }
}
