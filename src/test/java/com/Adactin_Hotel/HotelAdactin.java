package com.Adactin_Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AdactinPOM.com.AdactinHotel;


public class HotelAdactin extends Base_Class{

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		openLink("https://adactinhotelapp.com/");
		title();
		wait(10);
		AdactinHotel H = new AdactinHotel(driver);
		entervalue(H.getName(), "hari1996");
		entervalue(H.getPass(), "password@123");
		go(H.getLogin());
		dropdown(H.getLoc(), "text", "London");
		dropdown(H.getHotel(), "text", "Hotel Sunshine");
		dropdown(H.getRoom(), "text", "Super Deluxe");
		dropdown(H.getRoomno(), "value", "1");
		clear(H.getCheckin());
		entervalue(H.getCheckin(), "29/12/2021");
		clear(H.getCheckout());
		entervalue(H.getCheckout(), "02/01/2022");
		dropdown(H.getAdult(), "value", "2");
		go(H.getSearch());
		go(H.getRadio());
		go(H.getC());
		entervalue(H.getFname(), "Shanmuga");
		entervalue(H.getLname(), "Harish");
		entervalue(H.getAddress(), "Nagamalai Puthukotai,Madurai");
		entervalue(H.getCcnum(), "1234567893216541");
		dropdown(H.getCctype(), "value", "VISA");
		dropdown(H.getCcmonth(), "value", "7");
		dropdown(H.getCcyear(), "value", "2022");
		entervalue(H.getCvv(), "257");
		go(H.getBook());
		
		go(H.getItin());
		go(H.getLogout());
		
		
		
	}
	
}
