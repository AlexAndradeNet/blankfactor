/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.tasks.homepage;

import net.alexanderandrade.ui.screenplay.ui.homepage.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;

import static net.alexanderandrade.ui.screenplay.ui.homepage.HomePage.*;

public class HomeTasks {

  private HomeTasks() {
    throw new IllegalStateException("Utility class");
  }

  public static Performable open() {
    return Task.where(
      "{0} abre la página principal",
      Open.browserOn().the( HomePage.class ),
      new WaitUntilAngularIsReady(),
      WaitUntil.the( BUTTON_LOAD_MORE, WebElementStateMatchers.isClickable() )
      //Click.on( BUTTON_ACCEPT_COOKIES ).afterWaitingUntilPresent()
    );
  }

  public static Performable lookupForAuthorName ( String author) {
    return Task.where(
      "{0} busca al autor {1}",
      Click.on( LINK_LOOKED_AUTHOR.of(author) )
    );
  }

  public static Performable waitForPostList () {
    return Task.where(
      "{0} espera la lista de post promocionados {1}",
      WaitUntil.the(LIST_POST_LINKS, WebElementStateMatchers.isPresent())
    );
  }

}
