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
public class HomePage extends PageObject {

	private HomePage() {
		super();
	}

	public static final Target BUTTON_LOAD_MORE =
		Target.the("botón Load More")
			.located( By.xpath("//div[@class='load-more-btn-wrap']"));

	public static final Target BUTTON_ACCEPT_COOKIES =
		Target.the("botón Accept Cookies")
			.located( By.xpath("//a[@id='hs-eu-confirmation-button']"));

	public static final Target LIST_POST_LINKS =
		Target.the("botón Accept Cookies")
			.located( By.xpath("//h2[@class='heading-4 post-title']//a"));

	public static final Target LINK_LOOKED_AUTHOR =
		Target.the("link Author {0}")
			.locatedBy( "//div[@class='blog-layout']//a[contains(text(), '{0}')]");
}
