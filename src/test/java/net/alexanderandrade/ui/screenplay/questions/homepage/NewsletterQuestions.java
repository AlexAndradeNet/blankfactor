/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.questions.homepage;

import net.alexanderandrade.ui.screenplay.ui.homepage.NewsletterComponent;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.alexanderandrade.ui.screenplay.ui.homepage.NewsletterComponent.LABEL_NEWSLETTER_SUCCESS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewsletterQuestions {

  private NewsletterQuestions () {
    throw new IllegalStateException("Utility class");
  }

  @Subject("obtener el texto del encabezado de la página")
  public static Question<String> getLabelText () {
    return actor -> Text.of( NewsletterComponent.LABEL_NEWSLETTER_SUCCESS ).viewedBy(theActorInTheSpotlight()).asString() ;
  }

}
