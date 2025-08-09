package com.wipro.solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.wipro.filehandling.Excercise;

@Suite
@SelectPackages({"com.wipro.junittest"})
@SelectClasses({Excercise.class,StringTest.class})
class SelectPackagesTest {

	public class AllTestsInPackageSuite {
	    // This class remains empty; it only serves as a container for the test suite.
	}
}
