package com.serenity.steps.flightBooking;

import java.util.Map;

import org.junit.Assert;

import com.serenity.pages.FlightBookingPage;
import com.serenity.pages.HomePage;
import com.serenity.steps.CommonStep;

public class FlightBookingSteps extends CommonStep {

	FlightBookingPage fb;
	HomePage home;

	public void booking_one_way_flight(Map<String, String> userDetails) {
		//home.lnk_flight.click();

		fb.isExist(fb);

		fb.one_way_booking_flight(userDetails);
	}

}
