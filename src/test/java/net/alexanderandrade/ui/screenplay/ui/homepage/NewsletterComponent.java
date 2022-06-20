/**
 * Alexander Andrade CONFIDENTIAL
 *
 * <p>Copyright (c) 2022 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package net.alexanderandrade.ui.screenplay.ui.homepage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home.page")
public class NewsletterComponent extends PageObject {

	private NewsletterComponent () {
		super();
	}

	public static final Target FIELD_NEWSLETTER_EMAIL =
		Target.the("campo Email de la Newsletter")
			.located( By.name( "Email" ));

	public static final Target BUTTON_NEWSLETTER_SUSCRIBE =
		Target.the("campo Email de la Newsletter")
			.located( By.id( "form-newsletter-blog-submit-btn" ));

	public static final Target LABEL_NEWSLETTER_SUCCESS =
		Target.the("etiqueta de éxito de suscripción a la Newsletter")
			.located( By.className( "mc4wp-response" ));

}
