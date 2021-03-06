package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1Assert211 extends
		AttendanceLogicFlexibleROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(r1_1.getTime()-t1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t1.getTime()+t-r1_1.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(r2_1.getTime()-t1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
