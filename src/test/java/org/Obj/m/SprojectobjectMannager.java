package org.Obj.m;
import org.adactinpomc.AdactinPomclass;
import org.adactinpomc.Adactinsecondpage;
import org.adactinpomc.Bookahotelpom;
import org.adactinpomc.Sselectahotel;
import org.openqa.selenium.WebDriver;

public class SprojectobjectMannager {
	
	public WebDriver driver;
	private AdactinPomclass ap;
	private Adactinsecondpage as;
	private Sselectahotel sh;
	private Bookahotelpom pm;

	public SprojectobjectMannager(WebDriver driver) {
		this.driver=driver;
	}
	public AdactinPomclass getAp() {
		ap=new AdactinPomclass(driver);
		return ap;
	}
	public Adactinsecondpage getAs() {
		as=new Adactinsecondpage(driver);
		return as;
	}
	public Sselectahotel getSh() {
		sh=new Sselectahotel(driver);
		return sh;
	}
	public Bookahotelpom getPm() {
		pm=new Bookahotelpom(driver);
		return pm;
	}

}
