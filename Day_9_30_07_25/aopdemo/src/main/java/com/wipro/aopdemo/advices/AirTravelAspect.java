package com.wipro.aopdemo.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.wipro.aopdemo.exception.NoSeatAvailableException;

@Component
@Aspect
public class AirTravelAspect {
	@Before("execution(* com.wipro.aopdemo.services..checkIn(..))")//"execution(* com.wipro.aopvac.service..showBookingSlip(..))"
    public void showPhotoId() {
        System.out.println("Showing Photo ID before check-in.");
    }

    @Before("execution(*  AirTravelProcess.doBoarding*(..)) || execution(* AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("Showing boarding pass before security check/boarding.");
    }

    @AfterThrowing(pointcut = "execution(* AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatAvailable(NoSeatAvailableException ex) {
    	System.out.println("Please Contact Air line Manager: " + ex.getMessage());
    }
//    @AfterThrowing(pointcut="execution(* com.wipro.aopvac.service.AirTravelProcess.checkIn(..))", throwing="ex")
//	void handleNoSeatAvailable(NoSeatAvailableException ex)
//	{
//    	System.out.println("Please Contact Air line Manager: " + ex.getMessage());
//	}

}
