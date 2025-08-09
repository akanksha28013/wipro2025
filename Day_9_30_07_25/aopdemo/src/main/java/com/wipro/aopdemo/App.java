package com.wipro.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.config.AspectConfig;
import com.wipro.aopdemo.services.AirTravelProcess;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        AirTravelProcess atp = context.getBean(AirTravelProcess.class);
       
        try {
            atp.checkIn(true); 
            atp.collectBoardingPass();
            atp.doSecurityCheck();
            atp.doBoarding();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
}
