/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.tasks.homepage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;

import static net.alexanderandrade.ui.screenplay.ui.homepage.NewsletterComponent.*;

public class NewsletterTasks {

  private NewsletterTasks () {
    throw new IllegalStateException("Utility class");
  }

  public static Performable suscribeEmailToNewsletter ( String emailAdress) {

    return Task.where(
      "{0} inscribe su correo {1} a la newsletter",
      WaitUntil.the( FIELD_NEWSLETTER_EMAIL, WebElementStateMatchers.isClickable() ),
      Enter.theValue( emailAdress ).into( FIELD_NEWSLETTER_EMAIL ),
      Click.on( BUTTON_NEWSLETTER_SUSCRIBE ),
      new WaitUntilAngularIsReady(),
      WaitUntil.the( LABEL_NEWSLETTER_SUCCESS, WebElementStateMatchers.isVisible() ),
      WaitUntil.the( LABEL_NEWSLETTER_SUCCESS, WebElementStateMatchers.containsText( " " ) ) // Any text
    );
  }

}
