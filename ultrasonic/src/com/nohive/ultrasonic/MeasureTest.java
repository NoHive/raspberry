package com.nohive.ultrasonic;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.GpioProvider;
import com.pi4j.io.gpio.digital.DigitalInput;
import com.pi4j.io.gpio.digital.DigitalInputConfigBuilder;

public class MeasureTest {

	
	static final int PIN_TRIGGER = 18;
	static final int PIN_ECHO= 14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Measurement");
		
		Context picontext = Pi4J.newAutoContext();
		DigitalInputConfigBuilder builder = DigitalInput.newConfigBuilder(picontext);
		
		
		
	}

}
