package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest1AssertWeekend44 extends
		AttendanceLogicFlexibleTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),1);
		assertEquals(employeeDay.getOutWork(),1);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
	}
	
	@Override
	public void Testx_x_2() {
	}

}