package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1Assert42 extends
		AttendanceLogicFlexibleROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),2);
		assertEquals(employeeDay.getWorkShow(),1);
		assertEquals(employeeDay.getOutWork(),1);
	}


	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(r2_2.getTime()-r2_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
		
		

	}

}
