package com.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public abstract class Page extends PageObject  {
	
	public abstract WebElementFacade uniqueElement();


	
	public void isExist(Page p) {
		boolean flag = false;
		int count = 0;
		while (flag & count > 5) {

			try {
				
				
				p.uniqueElement().isCurrentlyVisible();

			} catch (Exception e) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				count++;

			}

		}

	}

}
