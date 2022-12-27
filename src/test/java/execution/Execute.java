package execution;



import org.testng.annotations.Test;

import umberlla.AlertExample;
import umberlla.RadioButton;
import umberlla.demo;

public class Execute {
/*
	@Test
	public void pageopen() {
		System.out.println("Start");
		demo.openingbrowser();
		demo.openingwebpage();
		System.out.println("finish");
	}
}*/
/*	@Test
	public void getbrowser() {
		System.out.println("Started");
		demo.textbox();
		System.out.println("Finish");
	}*/
	
	@Test
	public void gettextbox() {
		//System.out.println("Started");
		//demo.dropdown();
		//System.out.println("finish");
	}
	
	@Test
	public void getAlert() {
		//System.out.println("Started");
		//AlertExample.setAlert();
		//AlertExample.setPrompt();
		//System.out.println("Finish");
	}
	@Test
	public void getradiobutton() {
		//RadioButton.setRadioButton();
	}
}